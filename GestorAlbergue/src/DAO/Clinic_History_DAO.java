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

public class Clinic_History_DAO {
    private String mensaje = "";
    
    public String agregarClinicHistory(Connection con, Clinic_History clinic_history){
        PreparedStatement pst = null;
        String sql = "INSERT INTO ALBERGUE.Clinic_History (updatedClinic_History) " +
                     "VALUES (?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, clinic_history.getUpdatedClinic_History());

            pst.executeUpdate();
            pst.close();
            mensaje = "Guardado correctamente";
        } catch (SQLException e) {
            mensaje = "No se pudo guardar correctamente \n" + e.getMessage();
        }
        return mensaje;
    }

    public String modificarClinicHistory(Connection con, Clinic_History clinic_history){
        PreparedStatement pst = null;
        String sql = "UPDATE ALBERGUE.Clinic_History SET updatedClinic_History = ? " +
                     "WHERE idClinic_History = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, clinic_history.getUpdatedClinic_History());
            pst.setInt(2,clinic_history.getIdClinic_History());

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

    public String eliminarClinicHistory(Connection con, int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM ALBERGUE.Clinic_History WHERE idClinic_History = ?";

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

    public void listarClinicHistory(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"ID","updatedClinic_History"};
        model = new DefaultTableModel(null,columnas);
        
        String sql = "SELECT " +
             "idClinic_History, " +
             "updatedClinic_History " +
             "FROM ALBERGUE.Clinic_History " +
             "ORDER BY idClinic_History";

        
        String [] filas = new String[2];
        Statement st = null;
        ResultSet rs = null;
        
        try{
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                for (int i = 0; i < 2; i++) {
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
