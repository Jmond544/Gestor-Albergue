package Entity;

public class Attorney {
    private int idAttorney;
    private String dniAttorney;
    private String namesAttorney;
    private String surnamesAttorney;
    private String employmentSituation;
    private String civilStatus;
    private String socialConditions;
    private String levelStudy;

    public Attorney(int idAttorney, String dniAttorney, String namesAttorney, String surnamesAttorney, String employmentSituation, String civilStatus, String socialConditions) {
        this.idAttorney = idAttorney;
        this.dniAttorney = dniAttorney;
        this.namesAttorney = namesAttorney;
        this.surnamesAttorney = surnamesAttorney;
        this.employmentSituation = employmentSituation;
        this.civilStatus = civilStatus;
        this.socialConditions = socialConditions;
    }

    public Attorney() {
    }
    
    

    public int getIdAttorney() {
        return idAttorney;
    }

    public void setIdAttorney(int idAttorney) {
        this.idAttorney = idAttorney;
    }

    public String getDniAttorney() {
        return dniAttorney;
    }

    public void setDniAttorney(String dniAttorney) {
        this.dniAttorney = dniAttorney;
    }

    public String getNamesAttorney() {
        return namesAttorney;
    }

    public void setNamesAttorney(String namesAttorney) {
        this.namesAttorney = namesAttorney;
    }

    public String getSurnamesAttorney() {
        return surnamesAttorney;
    }

    public void setSurnamesAttorney(String surnamesAttorney) {
        this.surnamesAttorney = surnamesAttorney;
    }

    public String getEmploymentSituation() {
        return employmentSituation;
    }

    public void setEmploymentSituation(String employmentSituation) {
        this.employmentSituation = employmentSituation;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    public String getSocialConditions() {
        return socialConditions;
    }

    public void setSocialConditions(String socialConditions) {
        this.socialConditions = socialConditions;
    }

    public String getLevelStudy() {
        return levelStudy;
    }

    public void setLevelStudy(String levelStudy) {
        this.levelStudy = levelStudy;
    }
    
    
}
