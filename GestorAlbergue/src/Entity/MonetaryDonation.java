
package Entity;

public class MonetaryDonation {
    private int idMonetaryDonation;
    private int idDonor;
    private String dateDonation;
    private String methodDonation;
    private float amount;
    private String comments;
    private String status;

    public MonetaryDonation() {
    }

    public MonetaryDonation(int idMonetaryDonation, int idDonor, String dateDonation, String methodDonation, float amount, String comments, String status) {
        this.idMonetaryDonation = idMonetaryDonation;
        this.idDonor = idDonor;
        this.dateDonation = dateDonation;
        this.methodDonation = methodDonation;
        this.amount = amount;
        this.comments = comments;
        this.status = status;
    }

    public int getIdMonetaryDonation() {
        return idMonetaryDonation;
    }

    public void setIdMonetaryDonation(int idMonetaryDonation) {
        this.idMonetaryDonation = idMonetaryDonation;
    }

    public int getIdDonor() {
        return idDonor;
    }

    public void setIdDonor(int idDonor) {
        this.idDonor = idDonor;
    }

    public String getDateDonation() {
        return dateDonation;
    }

    public void setDateDonation(String dateDonation) {
        this.dateDonation = dateDonation;
    }

    public String getMethodDonation() {
        return methodDonation;
    }

    public void setMethodDonation(String methodDonation) {
        this.methodDonation = methodDonation;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MonetaryDonation{" + "idMonetaryDonation=" + idMonetaryDonation + ", idDonor=" + idDonor + ", dateDonation=" + dateDonation + ", methodDonation=" + methodDonation + ", amount=" + amount + ", comments=" + comments + ", status=" + status + '}';
    }
    
    
}
