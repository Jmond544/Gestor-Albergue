package Entity;

public class Patient {
    private int idPatient;
    private int idAttorney;
    private int idClinic_History;
    private String dniPatient;
    private String namesPatient;
    private String surnamesPatient;
    private int agePatient;
    private String diagnosis;

    public Patient(int idPatient, int idAttorney, int idClinic_History, String dniPatient, String namesPatient, String surnamesPatient, int agePatient, String diagnosis) {
        this.idPatient = idPatient;
        this.idAttorney = idAttorney;
        this.idClinic_History = idClinic_History;
        this.dniPatient = dniPatient;
        this.namesPatient = namesPatient;
        this.surnamesPatient = surnamesPatient;
        this.agePatient = agePatient;
        this.diagnosis = diagnosis;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public int getIdAttorney() {
        return idAttorney;
    }

    public void setIdAttorney(int idAttorney) {
        this.idAttorney = idAttorney;
    }

    public int getIdClinic_History() {
        return idClinic_History;
    }

    public void setIdClinic_History(int idClinic_History) {
        this.idClinic_History = idClinic_History;
    }

    public String getDniPatient() {
        return dniPatient;
    }

    public void setDniPatient(String dniPatient) {
        this.dniPatient = dniPatient;
    }

    public String getNamesPatient() {
        return namesPatient;
    }

    public void setNamesPatient(String namesPatient) {
        this.namesPatient = namesPatient;
    }

    public String getSurnamesPatient() {
        return surnamesPatient;
    }

    public void setSurnamesPatient(String surnamesPatient) {
        this.surnamesPatient = surnamesPatient;
    }

    public int getAgePatient() {
        return agePatient;
    }

    public void setAgePatient(int agePatient) {
        this.agePatient = agePatient;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    
    
}
