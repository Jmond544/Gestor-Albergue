package Entity;

public class Volunteer {
	int idVolunteer;
	int idArea;
	String dniVolunteer;
	String namesVolunteer;
	String surnamesVolunteer;
	String mailContactVolunteer;
	String cellPhoneNumberVolunteer;
	String addressVolunteer;
	String dateStart;
	String dateEnd;
	String skills;
	String experience;
	String hoursAvailability;
	
	public Volunteer(int idVolunteer, int idArea, String dniVolunteer, String namesVolunteer, String surnamesVolunteer,
			String mailContactVolunteer, String cellPhoneNumberVolunteer, String addressVolunteer, String dateStart,
			String dateEnd, String skills, String experience, String hoursAvailability) {
		super();
		this.idVolunteer = idVolunteer;
		this.idArea = idArea;
		this.dniVolunteer = dniVolunteer;
		this.namesVolunteer = namesVolunteer;
		this.surnamesVolunteer = surnamesVolunteer;
		this.mailContactVolunteer = mailContactVolunteer;
		this.cellPhoneNumberVolunteer = cellPhoneNumberVolunteer;
		this.addressVolunteer = addressVolunteer;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.skills = skills;
		this.experience = experience;
		this.hoursAvailability = hoursAvailability;
	}
	public Volunteer() {
		// TODO Auto-generated constructor stub
	}
	public int getIdVolunteer() {
		return idVolunteer;
	}
	public void setIdVolunteer(int idVolunteer) {
		this.idVolunteer = idVolunteer;
	}
	public int getIdArea() {
		return idArea;
	}
	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}
	public String getDniVolunteer() {
		return dniVolunteer;
	}
	public void setDniVolunteer(String dniVolunteer) {
		this.dniVolunteer = dniVolunteer;
	}
	public String getNamesVolunteer() {
		return namesVolunteer;
	}
	public void setNamesVolunteer(String namesVolunteer) {
		this.namesVolunteer = namesVolunteer;
	}
	public String getSurnamesVolunteer() {
		return surnamesVolunteer;
	}
	public void setSurnamesVolunteer(String surnamesVolunteer) {
		this.surnamesVolunteer = surnamesVolunteer;
	}
	public String getMailContactVolunteer() {
		return mailContactVolunteer;
	}
	public void setMailContactVolunteer(String mailContactVolunteer) {
		this.mailContactVolunteer = mailContactVolunteer;
	}
	public String getCellPhoneNumberVolunteer() {
		return cellPhoneNumberVolunteer;
	}
	public void setCellPhoneNumberVolunteer(String cellPhoneNumberVolunteer) {
		this.cellPhoneNumberVolunteer = cellPhoneNumberVolunteer;
	}
	public String getAddressVolunteer() {
		return addressVolunteer;
	}
	public void setAddressVolunteer(String addressVolunteer) {
		this.addressVolunteer = addressVolunteer;
	}
	public String getDateStart() {
		return dateStart;
	}
	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}
	public String getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getHoursAvailability() {
		return hoursAvailability;
	}
	public void setHoursAvailability(String hoursAvailability) {
		this.hoursAvailability = hoursAvailability;
	}
	
	
}
