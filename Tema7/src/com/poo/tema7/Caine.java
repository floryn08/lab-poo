package com.poo.tema7;

public class Caine {
	
	private String rase;
	private int weight;
	private String sex;
	private String dateOfBirth;
	
	public String getRase() {
		return rase;
	}
	public void setRase(String rase) {
		this.rase = rase;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	//shallow copy
	public Caine(String rase, int weight, String sex, String dateOfBirth) {
		super();
		this.rase = rase;
		this.weight = weight;
		this.sex = sex;
		this.dateOfBirth = dateOfBirth;
	}
	
	//deep copy
	public Caine (Caine otherDog){
		this.rase=otherDog.getRase();
		this.weight=otherDog.getWeight();
		this.sex=otherDog.getSex();
		this.dateOfBirth=otherDog.getDateOfBirth();
	}
}
