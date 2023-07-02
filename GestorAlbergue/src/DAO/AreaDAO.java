
package DAO;

import Entity.Area;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AreaDAO {
    private String mensaje = "";
    
    public String agregarArea(Connection con, Area area) {
        PreparedStatement pst = null;
        String sql = "INSERT INTO ALBERGUE.Area (idSupervisor, nameArea, descriptionArea, budgetArea) "
                + "VALUES (?, ?, ?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, area.getIdSupervisor());
            pst.setString(2, area.getNameArea());
            pst.setString(3, area.getDescriptionArea());
            pst.setDouble(4, area.getBudgetArea());
            pst.executeUpdate();
            pst.close();
            mensaje = "Guardado correctamente";

        } catch (SQLException e) {
            mensaje = "No se pudo guardar correctamente \n" + e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarArea(Connection con, Area area){
        PreparedStatement pst = null;
        String sql = "UPDATE ALBERGUE.Area SET idSupervisor = ?, nameArea = ?, descriptionArea = ?, budgetArea = ? WHERE idArea = ?";
        
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, area.getIdSupervisor());
            pst.setString(2, area.getNameArea());
            pst.setString(3, area.getDescriptionArea());
            pst.setDouble(4, area.getBudgetArea());
            pst.setInt(5, area.getIdArea());
            
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
    
    public String eliminarArea(Connection con, int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM ALBERGUE.Area WHERE idArea = ?";
        
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
    
    public void listarArea(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"ID", "idSupervisor", "nameArea", "descriptionArea", "budgetArea"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT idArea, idSupervisor, nameArea, descriptionArea, budgetArea FROM ALBERGUE.Area ORDER BY idArea";
        String [] filas = new String[5];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                for (int i = 0; i < 5; i++) {
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

