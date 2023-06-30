package Entity;

public class Clinic_History {
    private int idClinic_History;
    private String updatedClinic_History;

    public Clinic_History(int idClinic_History, String updatedClinic_History) {
        this.idClinic_History = idClinic_History;
        this.updatedClinic_History = updatedClinic_History;
    }

    public int getIdClinic_History() {
        return idClinic_History;
    }

    public void setIdClinic_History(int idClinic_History) {
        this.idClinic_History = idClinic_History;
    }

    public String getUpdatedClinic_History() {
        return updatedClinic_History;
    }

    public void setUpdatedClinic_History(String updatedClinic_History) {
        this.updatedClinic_History = updatedClinic_History;
    }
    
    
}
