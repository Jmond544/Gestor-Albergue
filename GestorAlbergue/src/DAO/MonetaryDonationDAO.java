
package DAO;

import Entity.MonetaryDonation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MonetaryDonationDAO {
    
    private String mensaje="";
    
    public String agregarMonetaryDonation(Connection con, MonetaryDonation mon){
        PreparedStatement pst=null;
        String sql="INSERT INTO ALBERGUE.MONETARYDONATION (iddonor,datedonation,methoddonation,amount,comments,status)"
            +"VALUES(?, TO_DATE(?, 'DD/MM/YYYY'), ?, ?, ?, ?)";
        
        try{
            pst=con.prepareStatement(sql);
            pst.setInt(1, mon.getIdDonor());
            pst.setString(2, mon.getDateDonation());
            pst.setString(3, mon.getMethodDonation());
            pst.setFloat(4, mon.getAmount());
            pst.setString(5, mon.getComments());
            pst.setString(6, mon.getStatus());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        }catch(Exception e){
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE \n "+ e.getMessage();
        }
        return mensaje; 
    }
    
    public String modificarMonetaryDonation(Connection con, MonetaryDonation mon){
        PreparedStatement pst=null;
        String sql="UPDATE ALBERGUE.MONETARYDONATION SET IDDONOR = ?, DATEDONATION = TO_DATE(?, 'DD/MM/YYYY'), METHODDONATION = ?, AMOUNT = ?, COMMENTS = ?, STATUS = ? "+
                "WHERE IDMONETARYDONATION = ?";
        
        try{
            pst=con.prepareStatement(sql);
            pst.setInt(1,mon.getIdDonor());
            pst.setString(2, mon.getDateDonation());
            pst.setString(3, mon.getMethodDonation());
            pst.setFloat(4, mon.getAmount());
            pst.setString(5, mon.getComments());
            pst.setString(6, mon.getStatus());
            pst.setInt(7, mon.getIdMonetaryDonation());
            
            pst.execute();
            mensaje="ACTUALIZADO CORRECTAMENTE";
            pst.close();
        }catch(Exception e){
            mensaje="NO SE PUDO MODIFICAR CORRECTAMENTE \n "+ e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarMonetaryDonation(Connection con, int id){
        PreparedStatement pst=null;
        String sql="DELETE FROM ALBERGUE.MONETARYDONATION WHERE IDMONETARYDONATION = ?";
        
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
    
    public void listarMonetaryDonation(Connection con, JTable tabla){
        DefaultTableModel model;
        String[] columnas = {"ID_DONACION_MONETARIA","ID_DONADOR","FECHA","MÉTODO","MONTO","COMENTARIOS","ESTATUS"};
        model = new DefaultTableModel(null,columnas);
        
        String sql = "SELECT " +
             "IDMONETARYDONATION, " +
             "IDDONOR, " +
             "TO_CHAR(DATEDONATION, 'DD/MM/YYYY') AS DATEDONATION, " +
             "METHODDONATION, " +
             "AMOUNT, " +
             "COMMENTS, " +
             "STATUS " +
             "FROM ALBERGUE.MONETARYDONATION";

        
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
        String sql="SELECT MAX(IDMONETARYDONATION)+1 as id FROM ALBERGUE.MONETARYDONATION";
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
