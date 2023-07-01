
package Entity;


public class Purchase {
    private int idPurchase;
    private int idArea;
    private int idSupplier;
    private String nameProduct;
    private String descriptionProduct;
    private String type;
    private float amount;
    private float unitAmount;

    public Purchase(int idPurchase, int idArea, int idSupplier, String nameProduct, String descriptionProduct, String type, float amount, float unitAmount) {
        this.idPurchase = idPurchase;
        this.idArea = idArea;
        this.idSupplier = idSupplier;
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
        this.type = type;
        this.amount = amount;
        this.unitAmount = unitAmount;
    }
    public Purchase(){
        
    }

    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setUnitAmount(float unitAmount) {
        this.unitAmount = unitAmount;
    }

    public int getIdPurchase() {
        return idPurchase;
    }

    public int getIdArea() {
        return idArea;
    }

    public int getIdSupplier() {
        return idSupplier;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public String getType() {
        return type;
    }

    public float getAmount() {
        return amount;
    }

    public float getUnitAmount() {
        return unitAmount;
    }
    
}
