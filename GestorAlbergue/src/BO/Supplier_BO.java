
package BO;
import DAO.Supplier_DAO;
import Entity.*;
import Database.OracleDatabaseConnector;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

public class Supplier_BO {
    
    private String mensaje="";
    private Supplier_DAO suDAO = new Supplier_DAO();
    
    public String agregarSupplier(Supplier supplier){
        Connection conn= OracleDatabaseConnector.getConnection();
        try {
            mensaje= suDAO.agregarSupplier(conn, supplier);
        } catch (Exception ex) {
            mensaje= mensaje + " "+ ex.getMessage();
        }
        return  mensaje;
    }
    public String modificarSupplier(Supplier supplier){
        Connection conn = OracleDatabaseConnector.getConnection();
        try {
            mensaje= suDAO.modificarSupplier(conn, supplier);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    public String eliminarSupplier(int id){
        Connection conn= OracleDatabaseConnector.getConnection();
        try{
            mensaje=suDAO.eliminarSupplier(conn, id);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    public void listarSupplier(JTable tabla){
        Connection conn= OracleDatabaseConnector.getConnection();
        suDAO.listarSupplier(conn, tabla);
    }
}