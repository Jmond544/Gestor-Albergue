

package DAO;

import Entity.Employee;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmployeeDAO {

    private String mensaje = "";

    public String agregarEmployee(Connection con, Employee employee) {
        PreparedStatement pst = null;
        String sql = "INSERT INTO Employee (idArea, surnamesEmployee, mailContact, cellPhoneNumber, address, dateStartContract, dateEndContract, positionEmployee, salary, benefits) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, employee.getIdArea());
            pst.setString(2, employee.getSurnamesEmployee());
            pst.setString(3, employee.getMailContact());
            pst.setString(4, employee.getCellPhoneNumber());
            pst.setString(5, employee.getAddress());
            pst.setDate(6, (Date) employee.getDateStartContract());
            pst.setDate(7, (Date) employee.getDateEndContract());
            pst.setString(8, employee.getPositionEmployee());
            pst.setBigDecimal(9, employee.getSalary());
            pst.setString(10, employee.getBenefits());
            pst.executeUpdate();
            pst.close();
            mensaje = "Guardado correctamente";

        } catch (SQLException e) {
            mensaje = "No se pudo guardar correctamente \n" + e.getMessage();
        }
        return mensaje;
    }

    public String modificarEmployee(Connection con, Employee employee) {
        PreparedStatement pst = null;
        String sql = "UPDATE Employee SET idArea = ?, surnamesEmployee = ?, mailContact = ?, cellPhoneNumber = ?, address = ?, dateStartContract = ?, dateEndContract = ?, positionEmployee = ?, salary = ?, benefits = ? WHERE idEmployee = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, employee.getIdArea());
            pst.setString(2, employee.getSurnamesEmployee());
            pst.setString(3, employee.getMailContact());
            pst.setString(4, employee.getCellPhoneNumber());
            pst.setString(5, employee.getAddress());
            pst.setDate(6, (Date) employee.getDateStartContract());
            pst.setDate(7, (Date) employee.getDateEndContract());
            pst.setString(8, employee.getPositionEmployee());
            pst.setBigDecimal(9, employee.getSalary());
            pst.setString(10, employee.getBenefits());
            pst.setInt(11, employee.getIdEmployee());

            int rowsAffected = pst.executeUpdate();
            pst.close();

            if (rowsAffected > 0) {
                mensaje = "Modificado correctamente";
            } else {
                mensaje = "No se encontró el registro para modificar";
            }
        } catch (SQLException e) {
            mensaje = "No se pudo modificar correctamente \n" + e.getMessage();
        }
        return mensaje;
    }

    public String eliminarEmployee(Connection con, int id) {
        PreparedStatement pst = null;
        String sql = "DELETE FROM Employee WHERE idEmployee = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);

            int rowsAffected = pst.executeUpdate();
            pst.close();

            if (rowsAffected > 0) {
                mensaje = "Eliminado correctamente";
            } else {
                mensaje = "No se encontró el registro para eliminar";
            }
        } catch (SQLException e) {
            mensaje = "No se pudo eliminar correctamente \n" + e.getMessage();
        }
        return mensaje;
    }

    public void listarEmployee(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"idEmployee", "idArea", "surnamesEmployee", "mailContact", "cellPhoneNumber", "address", "dateStartContract", "dateEndContract", "positionEmployee", "salary", "benefits"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT idEmployee, idArea, surnamesEmployee, mailContact, cellPhoneNumber, address, dateStartContract, dateEndContract, positionEmployee, salary, benefits FROM Employee ORDER BY idEmployee";
        String[] filas = new String[11];
        Statement st = null;
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 11; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
            System.out.println(e.getMessage());
        }
    }
}
