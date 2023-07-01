
package BO;
import DAO.Purchase_DAO;
import Entity.*;
import Database.OracleDatabaseConnector;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

public class Purchase_BO {
    String mensaje ="";
    private Purchase_DAO puDAO = new Purchase_DAO();
    
    public String agregarPurchase(Purchase purchase){
        Connection conn = OracleDatabaseConnector.getConnection();
        try {
            mensaje=puDAO.agregarPurchase(conn, purchase);
        } catch (Exception ex) {
            mensaje=puDAO+ " " + ex.getMessage();
        }
        return  mensaje;
    }
    public String modificarPurchase(Purchase purchase){
        Connection conn= OracleDatabaseConnector.getConnection();
        try {
            mensaje= puDAO.modificarPurchase(conn, purchase);
        } catch (Exception ex) {
            mensaje= mensaje + " "+ ex.getMessage();
        }
        return mensaje;
    }
    public String eliminarPurchase(int id){
        Connection conn= OracleDatabaseConnector.getConnection();
        try {
            mensaje= puDAO.eliminarPurchase(conn, id);
        } catch (Exception ex) {
            mensaje= mensaje + " "+ ex.getMessage();
        }
        return mensaje;
    }
    public void listarPurchase(JTable tabla){
        Connection conn= OracleDatabaseConnector.getConnection();
        puDAO.listarPurchase(conn, tabla);
    }
}
