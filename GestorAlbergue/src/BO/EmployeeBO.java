package BO;

import DAO.EmployeeDAO;
import Entity.Employee;
import Database.OracleDatabaseConnector;
import java.sql.Connection;
import javax.swing.JTable;

public class EmployeeBO {
    private String mensaje = "";
    private EmployeeDAO empDao = new EmployeeDAO();
    
    public String agregarEmployee(Employee employee){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = empDao.agregarEmployee(conn, employee);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        } 
        return mensaje;
    }
    
    public String modificarEmployee(Employee employee){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = empDao.modificarEmployee(conn, employee);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarEmployee(int id){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = empDao.eliminarEmployee(conn, id);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    
    public void listarEmployee(JTable tabla){
        Connection conn = OracleDatabaseConnector.getConnection();
        empDao.listarEmployee(conn, tabla);
    }
}
