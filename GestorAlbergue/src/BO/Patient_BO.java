package BO;
import DAO.Patient_DAO;
import Entity.*;
import Database.OracleDatabaseConnector;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

public class Patient_BO {
    private String mensaje = "";
    private Patient_DAO paDao = new Patient_DAO();
    
    public String agregarPatient(Patient patient){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = paDao.agregarPatient(conn, patient);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        } 
        return mensaje;
    }
    public String modificarPatient(Patient patient){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = paDao.modificarPatient(conn, patient);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    public String eliminarPatient(int id){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = paDao.eliminarPatient(conn, id);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    public void listarPatient(JTable tabla){
        Connection conn = OracleDatabaseConnector.getConnection();
        paDao.listarPatient(conn, tabla);
    }
}
