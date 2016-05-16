package com.poo.tema7;

public class CaineLucrator extends Caine {
	
	public CaineLucrator(Caine otherDog) {
		super(otherDog);
		
	}
	private String companyOwner;
	private String addressOfCompany;
	private String typeOfActivity;
	
	public String getCompanyOwner() {
		return companyOwner;
	}
	public void setCompanyOwner(String companyOwner) {
		this.companyOwner = companyOwner;
	}
	public String getAddressOfCompany() {
		return addressOfCompany;
	}
	public void setAddressOfCompany(String addressOfCompany) {
		this.addressOfCompany = addressOfCompany;
	}
	public String getTypeOfActivity() {
		return typeOfActivity;
	}
	public void setTypeOfActivity(String typeOfActivity) {
		this.typeOfActivity = typeOfActivity;
	}
	
	

}
