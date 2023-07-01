package BO;

import DAO.MaterialDonation_DAO;
import Entity.*;
import Database.OracleDatabaseConnector;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

public class MaterialDonation_BO {
    
    private String mensaje = "";
    private MaterialDonation_DAO mdDao = new MaterialDonation_DAO();
    
    public String agregarMaterialDonation(MaterialDonation materialDonation){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = mdDao.agregarMaterialDonation(conn, materialDonation);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        } 
        return mensaje;
    }
    
    public String modificarMaterialDonation(MaterialDonation materialDonation){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = mdDao.modificarMaterialDonation(conn, materialDonation);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarMaterialDonation(int id){
        Connection conn = OracleDatabaseConnector.getConnection();
        try{
            mensaje = mdDao.eliminarMaterialDonation(conn, id);
        } catch (Exception ex) {
            mensaje = mensaje + " " + ex.getMessage();
        }
        return mensaje;
    }
    
    public void listarMaterialDonation(JTable tabla){
        Connection conn = OracleDatabaseConnector.getConnection();
        mdDao.listarMaterialDonation(conn, tabla);
    }
}
