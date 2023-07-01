
package Entity;


public class MaterialDonation {
    private int idDonationMaterial;
    private int idDonor;
    private int idArea;
    private String dateDonation;
    private String comments;
    private String type;
    private float amount;
    private String status;

    public MaterialDonation(int idDonationMaterial, int idDonor, int idArea, String dateDonation, String comments, String type, float amount, String status) {
        this.idDonationMaterial = idDonationMaterial;
        this.idDonor = idDonor;
        this.idArea = idArea;
        this.dateDonation = dateDonation;
        this.comments = comments;
        this.type = type;
        this.amount = amount;
        this.status = status;
    }

    public MaterialDonation() {
    }

    public int getIdDonationMaterial() {
        return idDonationMaterial;
    }

    public void setIdDonationMaterial(int idDonationMaterial) {
        this.idDonationMaterial = idDonationMaterial;
    }

    public int getIdDonor() {
        return idDonor;
    }

    public void setIdDonor(int idDonor) {
        this.idDonor = idDonor;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getDateDonation() {
        return dateDonation;
    }

    public void setDateDonation(String dateDonation) {
        this.dateDonation = dateDonation;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
