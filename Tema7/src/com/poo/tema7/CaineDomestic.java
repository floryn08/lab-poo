package com.poo.tema7;

public class CaineDomestic extends Caine{
	
	private String owner;
	private String address;
	
	public CaineDomestic(Caine otherDog) {
		super(otherDog);
		
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
}
