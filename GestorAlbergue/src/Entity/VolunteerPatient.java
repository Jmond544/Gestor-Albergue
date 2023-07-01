
package Entity;
public class VolunteerPatient {
    int idVolunteer;
    int idPatient;

    public VolunteerPatient() {
        
    }

    public int getIdVolunteer() {
        return idVolunteer;
    }

    public void setIdVolunteer(int idVolunteer) {
        this.idVolunteer = idVolunteer;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public VolunteerPatient(int idVolunteer, int idPatient) {
        this.idVolunteer = idVolunteer;
        this.idPatient = idPatient;
    }
    
}
