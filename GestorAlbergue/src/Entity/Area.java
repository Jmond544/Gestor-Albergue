
package Entity;

public class Area {
    private int idArea;
    private int idSupervisor;
    private String nameArea;
    private String descriptionArea;
    private double budgetArea;
    
    public Area() {
    }
    
    public Area(int idSupervisor, String nameArea, String descriptionArea, double budgetArea) {
        this.idSupervisor = idSupervisor;
        this.nameArea = nameArea;
        this.descriptionArea = descriptionArea;
        this.budgetArea = budgetArea;
    }
    
    public int getIdArea() {
        return idArea;
    }
    
    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }
    
    public int getIdSupervisor() {
        return idSupervisor;
    }
    
    public void setIdSupervisor(int idSupervisor) {
        this.idSupervisor = idSupervisor;
    }
    
    public String getNameArea() {
        return nameArea;
    }
    
    public void setNameArea(String nameArea) {
        this.nameArea = nameArea;
    }
    
    public String getDescriptionArea() {
        return descriptionArea;
    }
    
    public void setDescriptionArea(String descriptionArea) {
        this.descriptionArea = descriptionArea;
    }
    
    public double getBudgetArea() {
        return budgetArea;
    }
    
    public void setBudgetArea(double budgetArea) {
        this.budgetArea = budgetArea;
    }
}

