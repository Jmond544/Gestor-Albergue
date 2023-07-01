
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

public class Purchase_DAO {
    private String mensaje="";
    public String agregarPurchase(Connection con, Purchase purchase){
        PreparedStatement pst=null;
       String sql = "INSERT INTO ALBERGUE.Purchase (idArea, idSupplier, nameProduct, descriptionProduct, type, amount, unitAmount) " +
               "VALUES (?,?,?,?,?,?,?)";
       try{
           pst = con.prepareStatement(sql);
           pst.setInt(1, purchase.getIdArea());
           pst.setInt(2, purchase.getIdSupplier());
           pst.setString(3, purchase.getNameProduct());
           pst.setString(4, purchase.getDescriptionProduct());
           pst.setString(5, purchase.getType());
           pst.setFloat(6, purchase.getAmount());
           pst.setFloat(7, purchase.getUnitAmount());
           
           pst.executeUpdate();
           pst.close();
           mensaje="Guardado correctamente";
       }
       catch(SQLException e){
           mensaje= "No se pudo guardar correctamente \n" + e.getMessage();
       }
       return mensaje;
    }
    public String modificarPurchase(Connection con, Purchase purchase){
        PreparedStatement pst= null;
        String sql = "UPDATE ALBERGUE.Purchase SET idArea=?, idSupplier=?, nameProduct=?, descriptionProduct=?, type=?, amount=?, unitAmount=?, " + 
              "WHERE idPurchase=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, purchase.getIdArea());
            pst.setInt(2, purchase.getIdSupplier());
            pst.setString(3, purchase.getNameProduct());
            pst.setString(4, purchase.getDescriptionProduct());
            pst.setString(5, purchase.getType());
            pst.setFloat(6, purchase.getAmount());
            pst.setFloat(7, purchase.getUnitAmount());
            pst.setInt(8, purchase.getIdPurchase());
            
            int rowsAffected = pst.executeUpdate();
            pst.close();
            
            if (rowsAffected>0) {
                mensaje = "Modificado correctamente";
            }
            else{
                mensaje="No se encontró el registro a modificar";
            }
            
        } catch (SQLException e) {
            mensaje= "No se pudo modificar correctamente \n" + e.getMessage();
        }
        return mensaje;
    }
    public String eliminarPurchase(Connection con, int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM ALBERGUE.Purchase WHERE idPurchase =?";
        try {
            pst=con.prepareStatement(sql);
            pst.setInt(1, id);
            
            int rowsAffected = pst.executeUpdate();
            pst.close();
            
            if(rowsAffected>0){
                mensaje="Eliminado correctamente";
            }
            else{
                mensaje="No se encontro el registro para eliminar";
            }
        } catch (SQLException e) {
            mensaje="No se pudo eliminar correctamente \n"+ e.getMessage();
        }
        return mensaje;
    }
    public void listarPurchase(Connection con, JTable tabla){
        DefaultTableModel model;
        String[] columnas = {"ID", "IdArea", "IdSupplier", "NameProduct", "DescriptionProduct", "Type", "Amount", "UnitAmount"};
        model = new DefaultTableModel(null,columnas);
        String sql="SELECT " +
                "IDPURCHASE, "+
                "IDAREA, "+
                "IDSUPPLIER, "+
                "NAMEPRODUCT, "+
                "DESCRIPTIONPRODUCT, "+
                "TYPE, "+
                "AMOUNT, "+
                "UNITAMOUNT " +
                "FROM ALBERGUE.Purchase "+
                "ORDER BY IDPURCHASE";
        String [] filas = new String[8];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st= con.createStatement();
            rs= st.executeQuery(sql);
            while (rs.next()) {
                for(int i=0; i<8;i++){
                    filas[i]= rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
        }
    } 
}