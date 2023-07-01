package BO;

import DAO.VolunteerPatientDAO;
import Database.OracleDatabaseConnector;
import Entity.VolunteerPatient;
import java.sql.Connection;
import javax.swing.JTable;

public class VolunteerPatientBO {
    private String mensaje = "";
    private VolunteerPatientDAO vpDao = new VolunteerPatientDAO();
    
    public String agregarVoluntarioDePaciente(VolunteerPatient vol){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = vpDao.agregarVoluntarioDePaciente(conn, vol);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    public String modificarVoluntarioDePaciente(VolunteerPatient vol){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = vpDao.modificarVoluntarioDePaciente(conn, vol);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    public String eliminarVoluntarioDePaciente(int id){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = vpDao.eliminarVoluntarioDePaciente(conn, id);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    public void listarVoluntariosDePacientes(JTable tabla){
        Connection conn = OracleDatabaseConnector.getConnection();
        vpDao.listarVoluntarios(conn, tabla);
    }
}
