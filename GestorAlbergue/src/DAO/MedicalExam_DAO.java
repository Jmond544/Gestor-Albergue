
package DAO;
import Entity.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class MedicalExam_DAO {
    
    private String mensaje = "";
    
    public String agregarMedicalExam(Connection con, MedicalExam medicalExam){
        PreparedStatement pst = null;
        String sql = "INSERT INTO ALBERGUE.Medical_Exam (idPatient, typeExam, dateExam, dateResults, results) " +
                     "VALUES (?, ?, TO_DATE(?, 'DD/MM/YYYY'), TO_DATE(?, 'DD/MM/YYYY'), ?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, medicalExam.getIdPatient());
            pst.setString(2, medicalExam.getTypeExam());
            pst.setString(3, medicalExam.getDateExam());
            pst.setString(4, medicalExam.getDateResults());
            pst.setString(5, medicalExam.getResults());

            pst.executeUpdate();
            pst.close();
            mensaje = "Guardado correctamente";
        } catch (SQLException e) {
            mensaje = "No se pudo guardar correctamente \n" + e.getMessage();
        }
        return mensaje;
    }

    public String modificarMedicalExam(Connection con, MedicalExam medicalExam){
        PreparedStatement pst = null;
        String sql = "UPDATE ALBERGUE.Medical_Exam SET idPatient = ?, typeExam = ?, dateExam = TO_DATE(?, 'DD/MM/YYYY'), " +
                     "dateResults = TO_DATE(?, 'DD/MM/YYYY'), results = ? WHERE idMedical_Exam = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, medicalExam.getIdPatient());
            pst.setString(2, medicalExam.getTypeExam());
            pst.setString(3, medicalExam.getDateExam());
            pst.setString(4, medicalExam.getDateResults());
            pst.setString(5, medicalExam.getResults());
            pst.setInt(6, medicalExam.getIdMedical_Exam());

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

    public String eliminarMedicalExam(Connection con, int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM ALBERGUE.Medical_Exam WHERE idMedical_Exam = ?";

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

    public void listarMedicalExam(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"ID","IdPatient","TypeExam", "DateExam", "DateResults", "Results"};
        model = new DefaultTableModel(null,columnas);
        
        String sql = "SELECT * FROM ALBERGUE.Medical_Exam ORDER BY idMedical_Exam";
        
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
