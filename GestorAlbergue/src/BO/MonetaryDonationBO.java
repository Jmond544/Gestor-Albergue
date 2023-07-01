package BO;

import DAO.MonetaryDonationDAO;
import Database.OracleDatabaseConnector;
import Entity.MonetaryDonation;
import java.sql.Connection;
import javax.swing.JTable;

public class MonetaryDonationBO {
    private String mensaje="";
    private MonetaryDonationDAO mddao = new MonetaryDonationDAO();
    
    public String agregarMonetaryDonation(MonetaryDonation mon){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = mddao.agregarMonetaryDonation(conn,mon);
        }catch(Exception e){
            mensaje=mensaje+" "+e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarMonetaryDonation(MonetaryDonation mon){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = mddao.modificarMonetaryDonation(conn,mon);
        }catch(Exception e){
            mensaje=mensaje+" "+e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarMonetaryDonation(int id){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = mddao.eliminarMonetaryDonation(conn,id);
        }catch(Exception e){
            mensaje=mensaje+" "+e.getMessage();
        }
        return mensaje;
    }
    
    public void listarMonetaryDonation(JTable tabla){
        Connection conn=OracleDatabaseConnector.getConnection();
        mddao.listarMonetaryDonation(conn,tabla);
    }
    
    public int getMaxID(){
        Connection conn=OracleDatabaseConnector.getConnection();
        int id=mddao.getMaxID(conn);
        return id;
    }
}


