package DAO;
import Entity.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Patient_DAO {
    private String mensaje = "";
    
    public String agregarPatient(Connection con, Patient patient){
        PreparedStatement pst = null;
        String sql = "INSERT INTO ALBERGUE.Patient (idAttorney, idClinic_History, dniPatient, namesPatient, surnamesPatient, agePatient, diagNosis) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, patient.getIdAttorney());
            pst.setInt(2, patient.getIdClinic_History());
            pst.setString(3, patient.getDniPatient());
            pst.setString(4, patient.getNamesPatient());
            pst.setString(5, patient.getSurnamesPatient());
            pst.setInt(6, patient.getAgePatient());
            pst.setString(7, patient.getDiagnosis());
            
            pst.executeUpdate();
            pst.close();
            mensaje = "Guardado correctamente";
        } catch (SQLException e) {
            mensaje = "No se pudo guardar correctamente \n" + e.getMessage();
        }
        return mensaje;
    }

    public String modificarPatient(Connection con, Patient patient){
        PreparedStatement pst = null;
        String sql = "UPDATE ALBERGUE.Patient SET idAttorney = ?, idClinic_History = ?, dniPatient = ?, namesPatient = ?, "
                + "surnamesPatient = ?, agePatient = ?, diagnosis = ? WHERE idPatient = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, patient.getIdAttorney());
            pst.setInt(2,patient.getIdClinic_History());
            pst.setString(3, patient.getDniPatient());
            pst.setString(4, patient.getNamesPatient());
            pst.setString(5, patient.getSurnamesPatient());
            pst.setInt(6, patient.getAgePatient());
            pst.setString(7, patient.getDiagnosis());
            pst.setInt(8, patient.getIdPatient());
            
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

    public String eliminarPatient(Connection con, int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM ALBERGUE.Patient WHERE idPatient = ?";

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

    public void listarPatient(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"ID","idAttorney","idClinic_History", "dniPatient", "namesPatient", "surnamesPatient","agePatient","diagnosis"};
        model = new DefaultTableModel(null,columnas);
        
        String sql = "SELECT " +
             "idPatient, " +
             "idAttorney, " +
             "idClinic_History, " +
             "dniPatient, " +
             "namesPatient, " +
             "surnamesPatient, " +
             "agePatient, " +
             "diagnosis " +
             "FROM ALBERGUE.Patient " +
             "ORDER BY idPatient";

        
        String [] filas = new String[8];
        Statement st = null;
        ResultSet rs = null;
        
        try{
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                for (int i = 0; i < 8; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
            System.out.println(e.getMessage());
        }
    }
}
