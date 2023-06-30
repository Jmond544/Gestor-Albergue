
package BO;

import DAO.Clinic_History_DAO;
import Entity.*;
import Database.OracleDatabaseConnector;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
public class Clinic_History_BO {
    private String mensaje = "";
    private Clinic_History_DAO chDao = new Clinic_History_DAO();
    
    public String agregarClinicHistory(Clinic_History clinic_history){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = chDao.agregarClinicHistory(conn, clinic_history);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        } 
        return mensaje;
    }
    public String modificarClinicHistory(Clinic_History clinic_history){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = chDao.modificarClinicHistory(conn, clinic_history);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    public String eliminarClinicHistory(int id){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = chDao.eliminarClinicHistory(conn, id);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    public void listarClinicHistory(JTable tabla){
        Connection conn = OracleDatabaseConnector.getConnection();
        chDao.listarClinicHistory(conn, tabla);
    }
}
