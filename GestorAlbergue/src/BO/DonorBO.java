
package BO;


import DAO.DonorDAO;
import Database.OracleDatabaseConnector;
import Entity.Donor;
import java.sql.Connection;
import javax.swing.JTable;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class DonorBO {
    
    private String mensaje="";
    private DonorDAO ddao = new DonorDAO();
    
    public String agregarDonor(Donor don){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = ddao.agregarDonor(conn,don);
        }catch(Exception e){
            mensaje=mensaje+" "+e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarDonor( Donor don){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = ddao.modificarDonor(conn,don);
        }catch(Exception e){
            mensaje=mensaje+" "+e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarDonor(int id){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = ddao.eliminarDonor(conn,id);
        }catch(Exception e){
            mensaje=mensaje+" "+e.getMessage();
        }
        return mensaje;
    }
    
    public void listarDonor(JTable tabla){
        Connection conn=OracleDatabaseConnector.getConnection();
        ddao.listarDonor(conn,tabla);
    }
    
    public int getMaxID(){
        Connection conn=OracleDatabaseConnector.getConnection();
        int id=ddao.getMaxID(conn);
        return id;
    }
}
