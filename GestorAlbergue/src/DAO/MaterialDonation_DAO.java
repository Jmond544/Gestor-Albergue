
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


public class MaterialDonation_DAO {
    
    private String mensaje = "";
    
    public String agregarMaterialDonation(Connection con, MaterialDonation materialDonation){
        PreparedStatement pst = null;
        String sql = "INSERT INTO ALBERGUE.MaterialDonation (idDonor, idArea, dateDonation, comments, type, amount, status) " +
                     "VALUES (?, ?, TO_DATE(?, 'DD/MM/YYYY'), ?, ?, ?, ?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, materialDonation.getIdDonor());
            pst.setInt(2, materialDonation.getIdArea());
            pst.setString(3, materialDonation.getDateDonation());
            pst.setString(4, materialDonation.getComments());
            pst.setString(5, materialDonation.getType());
            pst.setFloat(6, materialDonation.getAmount());
            pst.setString(7, materialDonation.getStatus());

            pst.executeUpdate();
            pst.close();
            mensaje = "Guardado correctamente";
        } catch (SQLException e) {
            mensaje = "No se pudo guardar correctamente \n" + e.getMessage();
        }
        return mensaje;
    }

    public String modificarMaterialDonation(Connection con, MaterialDonation materialDonation){
        PreparedStatement pst = null;
        String sql = "UPDATE ALBERGUE.MaterialDonation SET idDonor = ?, idArea = ?, dateDonation = TO_DATE(?, 'DD/MM/YYYY'), " +
                     "comments = ?, type = ?, amount = ?, status = ?  WHERE idDonationMaterial = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, materialDonation.getIdDonor());
            pst.setInt(2, materialDonation.getIdArea());
            pst.setString(3, materialDonation.getDateDonation());
            pst.setString(4, materialDonation.getComments());
            pst.setString(5, materialDonation.getType());
            pst.setFloat(6, materialDonation.getAmount());
            pst.setString(7, materialDonation.getStatus());
            pst.setInt(8, materialDonation.getIdDonationMaterial());

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

    public String eliminarMaterialDonation(Connection con, int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM ALBERGUE.MaterialDonation WHERE idDonationMaterial = ?";

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

    public void listarMaterialDonation(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"ID", "IdDonor", "IdArea", "DateDonation", "Comments", "Type", "Amount", "Status"};
        model = new DefaultTableModel(null,columnas);
        
        String sql = "SELECT * FROM ALBERGUE.MaterialDonation ORDER BY idDonationMaterial";
        
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
