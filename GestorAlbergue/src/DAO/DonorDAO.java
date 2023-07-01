
package DAO;

import Entity.Donor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DonorDAO {
    
    private String mensaje="";
    
    public String agregarDonor(Connection con, Donor don){
        PreparedStatement pst=null;
        String sql="INSERT INTO ALBERGUE.DONOR (namedonor,NICKNAMEDONOR,mailcontact,cellphonenumber,hero,categoryhero)"
            +"VALUES(?, ?, ?, ?, ?, ?)";
        
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1, don.getNameDonor());
            pst.setString(2, don.getNicknameDonor());
            pst.setString(3, don.getMailContact());
            pst.setString(4, don.getCellPhoneNumber());
            pst.setString(5, don.getHero());
            pst.setString(6, don.getCategoryHero());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        }catch(Exception e){
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE \n "+ e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarDonor(Connection con, Donor don){
        PreparedStatement pst=null;
        String sql="UPDATE ALBERGUE.DONOR SET NAMEDONOR = ?, NICKNAMEDONOR = ?, MAILCONTACT = ?, CELLPHONENUMBER = ?, HERO = ?, CATEGORYHERO = ? "+
                "WHERE IDDONOR = ?";
        
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1, don.getNameDonor());
            pst.setString(2, don.getNicknameDonor());
            pst.setString(3, don.getMailContact());
            pst.setString(4, don.getCellPhoneNumber());
            pst.setString(5, don.getHero());
            pst.setString(6, don.getCategoryHero());
            pst.setInt(7,don.getIdDonor());
            mensaje="ACTUALIZADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        }catch(Exception e){
            mensaje="NO SE PUDO MODIFICAR CORRECTAMENTE \n "+ e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarDonor(Connection con, int id){
        PreparedStatement pst=null;
        String sql="DELETE FROM ALBERGUE.DONOR WHERE IDDONOR = ?";
        
        try{
            pst=con.prepareStatement(sql);
            pst.setInt(1,id);
            mensaje="ELIMINADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        }catch(Exception e){
            mensaje="NO SE PUDO ELIMINAR CORRECTAMENTE \n "+ e.getMessage();
        }
        return mensaje;
    }
    
    public void listarDonor(Connection con, JTable tabla){
        DefaultTableModel model;
        String[] columnas = {"ID","NOMBRE","APODO","CORREO","CELULAR","HÉROE","CATEGORÍA DE HÉROE"};
        model = new DefaultTableModel(null,columnas);
        
        String sql = "SELECT * FROM ALBERGUE.DONOR ORDER BY IDDONOR";
        
        String[] filas = new String[7];
        Statement st = null;
        ResultSet rs = null;
        try{
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                for(int i=0;i<7;i++){
                    filas[i]=rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        }catch(Exception e){
            System.out.println("No se puede listar la tabla");
        }
    }
    
    
    public int getMaxID(Connection con){
        int id=0;
        PreparedStatement pst=null;
        ResultSet rs=null;
        String sql="SELECT MAX(IDDONOR)+1 as id FROM ALBERGUE.DONOR";
        try{
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                id=rs.getInt(1);
            }
            rs.close();
            pst.close();
        }catch(SQLException e){
            System.out.println("Error al mostrar el id "+e.getMessage());
        }
        return id;
    }
}
