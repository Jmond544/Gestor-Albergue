package BO;

import DAO.VolunteerDAO;
import Database.OracleDatabaseConnector;
import Entity.Volunteer;
import java.sql.Connection;
import javax.swing.JTable;

public class VolunteerBO {
    
    private String mensaje = "";
    private VolunteerDAO vDao = new VolunteerDAO();
    
    public String agregarVoluntario(Volunteer vol){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = vDao.agregarVoluntario(conn, vol);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    public String modificarVoluntario(Volunteer vol){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = vDao.modificarVoluntario(conn, vol);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    public String eliminarVoluntario(int id){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = vDao.eliminarVoluntario(conn, id);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    public void listarVoluntarios(JTable tabla){
        Connection conn = OracleDatabaseConnector.getConnection();
        vDao.listarVoluntarios(conn, tabla);
    }
}

