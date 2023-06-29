package BO;

import DAO.MedicalExam_DAO;
import Entity.*;
import Database.OracleDatabaseConnector;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

public class MedicalExam_BO {
    
    private String mensaje = "";
    private MedicalExam_DAO meDao = new MedicalExam_DAO();
    
    public String agregarMedicalExam(MedicalExam medicalExam){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = meDao.agregarMedicalExam(conn, medicalExam);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        } finally {
            try {
                if(conn!=null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    public String modificarMedicalExam(MedicalExam medicalExam){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = meDao.modificarMedicalExam(conn, medicalExam);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        } finally {
            try {
                if(conn!=null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    public String eliminarMedicalExam(int id){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = meDao.eliminarMedicalExam(conn, id);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        } finally {
            try {
                if(conn!=null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    public void listarMedicalExam(JTable tabla){
        Connection conn = OracleDatabaseConnector.getConnection();
        meDao.listarMedicalExam(conn, tabla);
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
