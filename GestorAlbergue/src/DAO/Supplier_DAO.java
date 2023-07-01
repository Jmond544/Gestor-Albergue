
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

public class Supplier_DAO {
    private  String mensaje="";
    
    public String agregarSupplier(Connection con, Supplier supplier){
        PreparedStatement pst= null;
        String sql= "INSERT INTO ALBERGUE.Supplier (name, mailContact, cellPhoneNumber, address, typeProduct)"+
                "VALUES(?,?,?,?,?)";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, supplier.getName());
            pst.setString(2, supplier.getMailContact());
            pst.setString(3, supplier.getCellPhoneNumber());
            pst.setString(4, supplier.getAddress());
            pst.setString(5, supplier.getTypeProduct());
            
            pst.executeUpdate();
            pst.close();
            mensaje="Guardado correctamente";
        } catch (SQLException e) {
            mensaje="No se pudo guardar correctamente \n"+ e.getMessage();
        }
        return mensaje;
    }public String modificarSupplier(Connection con, Supplier supplier){
        PreparedStatement pst=null;
        String sql="UPDATE ALBERGUE.Supplier SET name=?, mailContact=?, cellPhoneNumber=?, address=?, typeProduct=?"+
                "WHERE idSupplier=?";
            try {
                pst = con.prepareStatement(sql);
            pst.setString(1, supplier.getName());
            pst.setString(2, supplier.getMailContact());
            pst.setString(3, supplier.getCellPhoneNumber());
            pst.setString(4, supplier.getAddress());
            pst.setString(5, supplier.getTypeProduct());
            pst.setInt(6, supplier.getIdSuplier());
            
            int rowsAffected = pst.executeUpdate();
            pst.close();
                if (rowsAffected>0) {
                    mensaje="Modificado correctamente";
                }
                else{
                    mensaje="No se encontró el registro a modificar";
                }
            } catch (SQLException e) {
                mensaje="No se pudo modificar correctamente \n" + e.getMessage();
            }
        return mensaje;
    }
    public String eliminarSupplier(Connection con, int id){
        PreparedStatement pst=null;
        String sql= "DELETE FROM ALBERGUE.Supplier WHERE idSupplier =?";
        
        try {
            pst= con.prepareStatement(sql);
            pst.setInt(1, id);
            
            int rowsAffected= pst.executeUpdate();
            pst.close();
            if (rowsAffected>0) {
                mensaje="Eliminado correctamente";
            }
            else{
                mensaje="No se encontro el registro a eliminar";
            }
        } catch (SQLException e) {
            mensaje="No se pudo eliminar correctamente \n" + e.getMessage();
        }
        return mensaje;
    }
    public void listarSupplier(Connection con, JTable tabla){
        DefaultTableModel model;
        String[]  columnas ={"ID", "Name", "MailContact", "CellPhoneNumber", "Address", "TypeProduct"};
        model = new DefaultTableModel(null,columnas);
        
        String sql= "SELECT "+
                "IDSUPPLIER, "+
                "NAME, "+
                "MAILCONTACT, "+
                "CELLPHONENUMBER, "+
                "ADDRESS, "+
                "TYPEPRODUCT "+
                "FROM ALBERGUE.Supplier "+
                "ORDER BY IDSUPPLIER";
        
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
