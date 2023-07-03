

package DAO;

import Entity.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmployeeDAO {

    private String mensaje = "";

    public String agregarEmployee(Connection con, Employee employee) {
        PreparedStatement pst = null;
        String sql = "INSERT INTO ALBERGUE.Employee (idArea, surnamesEmployee, userName, password, mailContact, cellPhoneNumber, address, dateStartContract, dateEndContract, positionEmployee, salary, benefits) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, employee.getIdArea());
            pst.setString(2, employee.getSurnamesEmployee());
            pst.setString(3, employee.getUserName());
            pst.setString(4, employee.getPassword());
            pst.setString(5, employee.getMailContact());
            pst.setString(6, employee.getCellPhoneNumber());
            pst.setString(7, employee.getAddress());
            pst.setDate(8, new java.sql.Date(employee.getDateStartContract().getTime()));
            pst.setDate(9, new java.sql.Date(employee.getDateEndContract().getTime()));
            pst.setString(10, employee.getPositionEmployee());
            pst.setBigDecimal(11, employee.getSalary());
            pst.setString(12, employee.getBenefits());
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
        String sql = "UPDATE ALBERGUE.Employee SET idArea = ?, surnamesEmployee = ?, userName = ?, password = ?, "
                + "mailContact = ?, cellPhoneNumber = ?, address = ?, dateStartContract = ?, dateEndContract = ?, "
                + "positionEmployee = ?, salary = ?, benefits = ? WHERE idEmployee = ?";
        
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, employee.getIdArea());
            pst.setString(2, employee.getSurnamesEmployee());
            pst.setString(3, employee.getUserName());
            pst.setString(4, employee.getPassword());
            pst.setString(5, employee.getMailContact());
            pst.setString(6, employee.getCellPhoneNumber());
            pst.setString(7, employee.getAddress());
            pst.setDate(8, new java.sql.Date(employee.getDateStartContract().getTime()));
            pst.setDate(9, new java.sql.Date(employee.getDateEndContract().getTime()));
            pst.setString(10, employee.getPositionEmployee());
            pst.setBigDecimal(11, employee.getSalary());
            pst.setString(12, employee.getBenefits());
            pst.setInt(13, employee.getIdEmployee());
            
            int rowsAffected = pst.executeUpdate();
            pst.close();
            
            if (rowsAffected > 0) {
                mensaje = "Modificado correctamente";
            } else {
                mensaje = "No se encontró el registro para modificar";
            }
        } catch (SQLException e){
            mensaje = "No se pudo modificar correctamente \n" + e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarEmployee(Connection con, int id) {
        PreparedStatement pst = null;
        String sql = "DELETE FROM ALBERGUE.Employee WHERE idEmployee = ?";
        
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
        } catch (SQLException e){
            mensaje = "No se pudo eliminar correctamente \n" + e.getMessage();
        }
        return mensaje;
    }
    
    public void listarEmployee(Connection con, JTable tabla) {
    DefaultTableModel model;
    String[] columnas = {"ID", "idArea", "surnamesEmployee", "userName", "password", "mailContact", "cellPhoneNumber", "address", "dateStartContract", "dateEndContract", "positionEmployee", "salary", "benefits"};
    model = new DefaultTableModel(null, columnas);
    String sql = "SELECT idEmployee, "
            + "idArea, "
            + "surnamesEmployee, "
            + "userName, password, "
            + "mailContact, "
            + "cellPhoneNumber, "
            + "address, "
            + "TO_CHAR(dateStartContract, 'DD/MM/YYYY'), "
            + "TO_CHAR(dateEndContract, 'DD/MM/YYYY'), "
            + "positionEmployee, "
            + "salary, "
            + "benefits "
            + "FROM ALBERGUE.Employee ORDER BY idEmployee";
    String[] filas = new String[13];
    Statement st = null;
    ResultSet rs = null;

    try {
        st = con.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            for (int i = 0; i < 13; i++) {
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
