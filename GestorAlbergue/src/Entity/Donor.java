
package Entity;

public class Donor {
    private int idDonor;
    private String nameDonor;
    private String nicknameDonor;
    private String mailContact;
    private String cellPhoneNumber;
    private String hero;
    private String categoryHero;

    public Donor() {
    }

    public Donor(int idDonor, String nameDonor, String nicknameDonor, String mailContact, String cellPhoneNumber, String hero, String categoryHero) {
        this.idDonor = idDonor;
        this.nameDonor = nameDonor;
        this.nicknameDonor = nicknameDonor;
        this.mailContact = mailContact;
        this.cellPhoneNumber = cellPhoneNumber;
        this.hero = hero;
        this.categoryHero = categoryHero;
    }

    public int getIdDonor() {
        return idDonor;
    }

    public void setIdDonor(int idDonor) {
        this.idDonor = idDonor;
    }

    public String getNameDonor() {
        return nameDonor;
    }

    public void setNameDonor(String nameDonor) {
        this.nameDonor = nameDonor;
    }

    public String getNicknameDonor() {
        return nicknameDonor;
    }

    public void setNicknameDonor(String nicknameDonor) {
        this.nicknameDonor = nicknameDonor;
    }

    public String getMailContact() {
        return mailContact;
    }

    public void setMailContact(String mailContact) {
        this.mailContact = mailContact;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public String getCategoryHero() {
        return categoryHero;
    }

    public void setCategoryHero(String categoryHero) {
        this.categoryHero = categoryHero;
    }

    @Override
    public String toString() {
        return "Donor{" + "idDonor=" + idDonor + ", nameDonor=" + nameDonor + ", nicknameDonor=" + nicknameDonor + ", mailContact=" + mailContact + ", cellPhoneNumber=" + cellPhoneNumber + ", hero=" + hero + ", categoryHero=" + categoryHero + '}';
    }
    
    
}
