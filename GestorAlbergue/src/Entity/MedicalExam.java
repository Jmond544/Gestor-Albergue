
package Entity;


public class MedicalExam {
    private int idMedical_Exam;
    private int idPatient;
    private String typeExam;
    private String dateExam;
    private String dateResults;
    private String results;

    public MedicalExam(int idMedical_Exam, int idPatient, String typeExam, String dateExam, String dateResults, String results) {
        this.idMedical_Exam = idMedical_Exam;
        this.idPatient = idPatient;
        this.typeExam = typeExam;
        this.dateExam = dateExam;
        this.dateResults = dateResults;
        this.results = results;
    }
    
    public MedicalExam(){
        
    }

    public void setIdMedical_Exam(int idMedical_Exam) {
        this.idMedical_Exam = idMedical_Exam;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public void setTypeExam(String typeExam) {
        this.typeExam = typeExam;
    }

    public void setDateExam(String dateExam) {
        this.dateExam = dateExam;
    }

    public void setDateResults(String dateResults) {
        this.dateResults = dateResults;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public int getIdMedical_Exam() {
        return idMedical_Exam;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public String getTypeExam() {
        return typeExam;
    }

    public String getDateExam() {
        return dateExam;
    }

    public String getDateResults() {
        return dateResults;
    }

    public String getResults() {
        return results;
    }
    
    
}
