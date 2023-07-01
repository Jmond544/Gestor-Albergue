
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

public class Necessity_DAO {
    
    private String mensaje = "";
    
    public String agregarNecessity(Connection con, Necessity necessity){
        PreparedStatement pst = null;
        String sql = "INSERT INTO ALBERGUE.Necessity (idArea, idMonetaryDonation, description, dateRequest, estimatedCost) " +
                     "VALUES (?, ?, ?, TO_DATE(?, 'DD/MM/YYYY'), ?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, necessity.getIdArea());
            pst.setInt(2, necessity.getIdMonetaryDonation());
            pst.setString(3, necessity.getDescription());
            pst.setString(4, necessity.getDateRequest());
            pst.setFloat(5, necessity.getEstimatedCost());

            pst.executeUpdate();
            pst.close();
            mensaje = "Guardado correctamente";
        } catch (SQLException e) {
            mensaje = "No se pudo guardar correctamente \n" + e.getMessage();
        }
        return mensaje;
    }

    public String modificarNecessity(Connection con, Necessity necessity){
        PreparedStatement pst = null;
        String sql = "UPDATE ALBERGUE.Necessity SET idArea = ?, idMonetaryDonation = ?, description = ?, dateRequest = TO_DATE(?, 'DD/MM/YYYY'), " +
                     "estimatedCost = ?  WHERE idDonationMaterial = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, necessity.getIdArea());
            pst.setInt(2, necessity.getIdMonetaryDonation());
            pst.setString(3, necessity.getDescription());
            pst.setString(4, necessity.getDateRequest());
            pst.setFloat(5, necessity.getEstimatedCost());
            pst.setInt(6, necessity.getIdNecessity());

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

    public String eliminarNecessity(Connection con, int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM ALBERGUE.Necessity WHERE idNecessity = ?";

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

    public void listarNecessity(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"ID", "IdArea", "IdMonetaryDonation", "Description", "DateRequest", "EstimatedCost"};
        model = new DefaultTableModel(null,columnas);
        
        String sql = "SELECT * FROM ALBERGUE.Necessity ORDER BY idNecessity";
        
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
            System.out.println(e.getMessage());
        }
    }
    
}
