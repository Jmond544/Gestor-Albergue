
package BO;
import DAO.Attorney_DAO;
import Entity.*;
import Database.OracleDatabaseConnector;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

public class Attorney_BO {
    private String mensaje = "";
    private Attorney_DAO atDao = new Attorney_DAO();
    
    public String agregarAttorney(Attorney attorney){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = atDao.agregarAttorney(conn, attorney);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        } 
        return mensaje;
    }
    
    public String modificarAttorney(Attorney attorney){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = atDao.modificarAttorney(conn, attorney);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarAttorney(int id){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = atDao.eliminarAttorney(conn, id);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    
    public void listarAttorney(JTable tabla){
        Connection conn = OracleDatabaseConnector.getConnection();
        atDao.listarAttorney(conn, tabla);
    }
}
