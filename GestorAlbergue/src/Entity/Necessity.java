
package Entity;

public class Necessity {
    private int idNecessity;
    private int idArea;
    private int idMonetaryDonation;
    private String description;
    private String dateRequest;
    private float estimatedCost;

    public Necessity(int idNecessity, int idArea, int idMonetaryDonation, String description, String dateRequest, float estimatedCost) {
        this.idNecessity = idNecessity;
        this.idArea = idArea;
        this.idMonetaryDonation = idMonetaryDonation;
        this.description = description;
        this.dateRequest = dateRequest;
        this.estimatedCost = estimatedCost;
    }

    public Necessity() {
    }

    public int getIdNecessity() {
        return idNecessity;
    }

    public void setIdNecessity(int idNecessity) {
        this.idNecessity = idNecessity;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public int getIdMonetaryDonation() {
        return idMonetaryDonation;
    }

    public void setIdMonetaryDonation(int idMonetaryDonation) {
        this.idMonetaryDonation = idMonetaryDonation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateRequest() {
        return dateRequest;
    }

    public void setDateRequest(String dateRequest) {
        this.dateRequest = dateRequest;
    }

    public float getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(float estimatedCost) {
        this.estimatedCost = estimatedCost;
    }
    
}
