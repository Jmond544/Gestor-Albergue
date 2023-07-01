package DAO;

import Entity.VolunteerPatient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VolunteerPatientDAO {
    private String mensaje = "";
    
    public String agregarVoluntarioDePaciente(Connection con, VolunteerPatient vol){
        PreparedStatement pst = null;
        String sql = "INSERT INTO ALBERGUE.VOLUNTEERPATIENT (idVolunteer, idPatient) " +
                     "VALUES (?, ?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, vol.getIdVolunteer());
            pst.setInt(2, vol.getIdPatient());
            pst.executeUpdate();
            pst.close();
            mensaje = "Guardado correctamente";
        } catch (SQLException e) {
            mensaje = "No se pudo guardar correctamente \n" + e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarVoluntarioDePaciente(Connection con, VolunteerPatient vol){
        PreparedStatement pst = null;
        String sql = "UPDATE ALBERGUE.VOLUNTEERPATIENT SET idVolunteer = ?, idPatient = ?"
                    + "WHERE IDVOLUNTEER = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, vol.getIdVolunteer());
            pst.setInt(2, vol.getIdPatient());
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
    
    public String eliminarVoluntarioDePaciente(Connection con, int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM ALBERGUE.VOLUNTEERPATIENTE WHERE IDVOLUNTEER = ?";

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
    
    public void listarVoluntarios(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"IDVOLUNTEER", "IDPATIENT"};
        model = new DefaultTableModel(null,columnas);
        
        String sql = "SELECT " +
                "IDVOLUNTEER, " +
                "IDPATIENT " + 
                "FROM ALBERGUE.VOLUNTEERPATIENT " +
                "ORDER BY IDVOLUNTEER";
        
        String [] filas = new String[6];
        Statement st = null;
        ResultSet rs = null;
        
        try{
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                for (int i = 0; i < 6; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
        }
    }
}
