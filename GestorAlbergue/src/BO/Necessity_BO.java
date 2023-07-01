

package BO;

import DAO.Necessity_DAO;
import Entity.*;
import Database.OracleDatabaseConnector;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

public class Necessity_BO {
    
    private String mensaje = "";
    private Necessity_DAO neDao = new Necessity_DAO();
    
    public String agregarNecessity(Necessity necessity){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = neDao.agregarNecessity(conn, necessity);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        } 
        return mensaje; 
    }
    
    public String modificarNecessity(Necessity necessity){
    Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = neDao.modificarNecessity(conn, necessity);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarNecessity(int id){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = neDao.eliminarNecessity(conn, id);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    
    public void listarNecessity(JTable tabla){
        Connection conn = OracleDatabaseConnector.getConnection();
        neDao.listarNecessity(conn, tabla);
    }
}
