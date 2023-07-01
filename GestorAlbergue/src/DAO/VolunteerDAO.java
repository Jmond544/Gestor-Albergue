
package DAO;
import Entity.Volunteer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class VolunteerDAO {
    
    private String mensaje = "";
    
    public String agregarVoluntario(Connection con, Volunteer vol){
        PreparedStatement pst = null;
        String sql = "INSERT INTO ALBERGUE.VOLUNTEER (idArea, dniVolunter, namesVolunteer, surnamesVolunteer, mailContactVolunteer, CELLPHONENUMBERVOLUNTEER, addressVolunteer, dateStart, dateEnd, skills, experience,  hoursAvailability) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, TO_DATE(?, 'DD/MM/YYYY'), TO_DATE(?, 'DD/MM/YYYY'), ?, ?, ?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, vol.getIdArea());
			pst.setString(2, vol.getDniVolunteer());
			pst.setString(3, vol.getNamesVolunteer());
			pst.setString(4, vol.getSurnamesVolunteer());
			pst.setString(5, vol.getMailContactVolunteer());
			pst.setString(6, vol.getCellPhoneNumberVolunteer());
			pst.setString(7, vol.getAddressVolunteer());
			pst.setString(8, vol.getDateStart());
			pst.setString(9, vol.getDateEnd());
			pst.setString(10, vol.getSkills());
			pst.setString(11, vol.getExperience());
			pst.setString(12, vol.getHoursAvailability());
            pst.executeUpdate();
            pst.close();
            mensaje = "Guardado correctamente";
        } catch (SQLException e) {
            mensaje = "No se pudo guardar correctamente \n" + e.getMessage();
        }
        return mensaje;
    }

    public String modificarVoluntario(Connection con, Volunteer vol){
        PreparedStatement pst = null;
        String sql = "UPDATE ALBERGUE.VOLUNTEER SET IDAREA = ?, DNIVOLUNTER = ?, NAMESVOLUNTEER = ?, SURNAMESVOLUNTEER = ? , MAILCONTACTVOLUNTEER = ? , CELLPHONENUMBERVOLUNTEER = ? , addressVolunteer = ?, dateStart = TO_DATE(?, 'DD/MM/YYYY'), dateEnd = TO_DATE(?, 'DD/MM/YYYY'), skills = ? , experience = ? , hoursAvailability = ?"
				   + "WHERE IDVOLUNTEER = ?";

        try {
            pst = con.prepareStatement(sql);
			pst.setInt(1, vol.getIdArea());
			pst.setString(2, vol.getDniVolunteer());
			pst.setString(3, vol.getNamesVolunteer());
			pst.setString(4, vol.getSurnamesVolunteer());
			pst.setString(5, vol.getMailContactVolunteer());
			pst.setString(6, vol.getCellPhoneNumberVolunteer());
			pst.setString(7, vol.getAddressVolunteer());
			pst.setString(8, vol.getDateStart());
			pst.setString(9, vol.getDateEnd());
			pst.setString(10, vol.getSkills());
			pst.setString(11, vol.getExperience());
			pst.setString(12, vol.getHoursAvailability());
			pst.setInt(13, vol.getIdVolunteer()); 
			int rowsAffected = pst.executeUpdate();
            pst.close();

            if (rowsAffected > 0) {
                mensaje = "Modificado correctamente";
            } else {
                mensaje = "No se encontró el registro para modificar";
            }
        } catch (SQLException e) {
            mensaje = "No se pudo modificar correctamente \n" + e.getMessage();
        }
        return mensaje;
    }

    public String eliminarVoluntario(Connection con, int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM ALBERGUE.VOLUNTEER WHERE IDVOLUNTEER = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);

            int rowsAffected = pst.executeUpdate();
            pst.close();

            if (rowsAffected > 0) {
                mensaje = "Eliminado correctamente";
            } else {
                mensaje = "No se encontró el registro para eliminar";
            }
        } catch (SQLException e) {
            mensaje = "No se pudo eliminar correctamente \n" + e.getMessage();
        }
        return mensaje;
    }

    public void listarVoluntarios(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"IDVOLUNTEER", "IDAREA", "DNI", "NAMES", "SURNAMES" , "MAILCONTACT", "cellPhoneNumber", "address" , "dateStart", "dateEnd", "skills" , "experience", "hoursAvailability"};
        model = new DefaultTableModel(null,columnas);
        
        String sql = "SELECT " +
                "idVolunteer, " +
                "idArea, " +
                "dniVolunter, " + 
                "namesVolunteer, " + 
                "surnamesVolunteer, " + 
                "mailContactVolunteer, " + 
                "CELLPHONENUMBERVOLUNTEER, " + 
                "addressVolunteer, " +
                "TO_CHAR(dateStart, 'DD/MM/YYYY') AS dateStart, " +
                "TO_CHAR(dateEnd, 'DD/MM/YYYY') AS dateEnd, " +
                "skills, " +
                "experience, " +
                "hoursAvailability " +
                "FROM ALBERGUE.VOLUNTEER " +
                "ORDER BY IDVOLUNTEER";
        
        String [] filas = new String[6];
        Statement st = null;
        ResultSet rs = null;
        
        try{
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                for (int i = 0; i < 6; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
            System.out.println(e.getMessage());
        }
    }
}

