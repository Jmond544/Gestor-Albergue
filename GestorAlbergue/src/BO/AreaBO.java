
package BO;


import DAO.AreaDAO;
import Entity.Area;
import Database.OracleDatabaseConnector;
import java.sql.Connection;
import javax.swing.JTable;

public class AreaBO {
    private String mensaje = "";
    private AreaDAO areaDAO = new AreaDAO();
    
    public String agregarArea(Area area){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = areaDAO.agregarArea(conn, area);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        } 
        return mensaje;
    }
    
    public String modificarArea(Area area){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = areaDAO.modificarArea(conn, area);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarArea(int id){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = areaDAO.eliminarArea(conn, id);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    
    public void listarArea(JTable tabla){
        Connection conn = OracleDatabaseConnector.getConnection();
        areaDAO.listarArea(conn, tabla);
    }
}

