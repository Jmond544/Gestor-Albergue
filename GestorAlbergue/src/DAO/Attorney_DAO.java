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

public class Attorney_DAO {

    private String mensaje = "";

    public String agregarAttorney(Connection con, Attorney attorney) {
        PreparedStatement pst = null;
        String sql = "INSERT INTO ALBERGUE.Attorney (dniAttorney, namesAttorney, surnamesAttorney, employmentSituation, civilStatus, socialConditions, levelStudy) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, attorney.getDniAttorney());
            pst.setString(2, attorney.getNamesAttorney());
            pst.setString(3, attorney.getSurnamesAttorney());
            pst.setString(4, attorney.getEmploymentSituation());
            pst.setString(5, attorney.getCivilStatus());
            pst.setString(6, attorney.getSocialConditions());
            pst.setString(7, attorney.getLevelStudy());
            pst.executeUpdate();
            pst.close();
            mensaje = "Guardado correctamente";

        } catch (SQLException e) {
            mensaje = "No se pudo guardar correctamente \n" + e.getMessage();
        }
        return mensaje;
    }

    public String modificarAttorney(Connection con, Attorney attorney){
        PreparedStatement pst = null;
        String sql = "UPDATE ALBERGUE.Attorney SET dniAttorney = ?, namesAttorney = ?, surnamesAttorney = ?, employmentSituation = ?, "
                + "civilStatus = ?, socialConditions = ?, levelStudy = ? WHERE idAttorney = ?";
        
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, attorney.getDniAttorney());
            pst.setString(2, attorney.getNamesAttorney());
            pst.setString(3, attorney.getSurnamesAttorney());
            pst.setString(4, attorney.getEmploymentSituation());
            pst.setString(5, attorney.getCivilStatus());
            pst.setString(6, attorney.getSocialConditions());
            pst.setString(7, attorney.getLevelStudy());
            pst.setInt(8, attorney.getIdAttorney());
            
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
    
    public String eliminarAttorney(Connection con, int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM ALBERGUE.Attorney WHERE idAttorney = ?";
        
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
    
    public void listarAttorney(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"ID","dniAttorney","namesAttorney","surnamesAttorney","employmentSituation","civilStatus","socialConditions","levelStudy"};
        model = new DefaultTableModel(null,columnas);
        String sql = "SELECT " +
                "idAttorney," +
                "dniAttorney," +
                "namesAttorney," +
                "surnamesAttorney," +
                "employmentSituation," +
                "civilStatus," +
                "socialConditions," +
                "levelStudy " +
                "FROM ALBERGUE.Attorney "+
                "ORDER BY idAttorney";
        String [] filas = new String[8];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                for (int i = 0; i < 8; i++) {
                    filas[i] = rs.getString(i+1);
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
