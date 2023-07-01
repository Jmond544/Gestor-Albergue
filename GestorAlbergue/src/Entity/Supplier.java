
package Entity;


public class Supplier {
    private int idSuplier;
    private String name;
    private String mailContact;
    private String cellPhoneNumber;
    private String address;
    private String typeProduct;

    public Supplier(int idSuplier, String name, String mailContact, String cellPhoneNumber, String address, String typeProduct) {
        this.idSuplier = idSuplier;
        this.name = name;
        this.mailContact = mailContact;
        this.cellPhoneNumber = cellPhoneNumber;
        this.address = address;
        this.typeProduct = typeProduct;
    }
    public Supplier(){
        
    }

    public void setIdSuplier(int idSuplier) {
        this.idSuplier = idSuplier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMailContact(String mailContact) {
        this.mailContact = mailContact;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }

    public int getIdSuplier() {
        return idSuplier;
    }

    public String getName() {
        return name;
    }

    public String getMailContact() {
        return mailContact;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getTypeProduct() {
        return typeProduct;
    }
    
    
}

