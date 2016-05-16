package com.poo.tema7;

public class Main {
	public static void main(String[] args) {
		Caine firstDog = new Caine("Labrador", 50, "Feminin", "2 Mai 2005");
		Caine secondDog = new Caine("Lup", 60, "Masculin", "13 octombrie 2011");
		CaineDomestic caineDomestic = new CaineDomestic(firstDog);
		CaineLucrator caineLucrator = new CaineLucrator(secondDog);

		caineDomestic.setOwner("Mihai");
		caineDomestic.setAddress("Brasov");

		System.out.println("Cainele domestic: " + caineDomestic.getRase() + ", " + caineDomestic.getWeight() + ", "
				+ caineDomestic.getSex() + ", " + caineDomestic.getDateOfBirth() + ", " + caineDomestic.getOwner() + ", "
				+ caineDomestic.getAddress());

		caineLucrator.setCompanyOwner("MyCompany");
		caineLucrator.setAddressOfCompany("Iasi");
		caineLucrator.setTypeOfActivity("Police");

		
		System.out.println("Cainele lucrator: " + caineLucrator.getRase() + ", " + caineLucrator.getWeight() + ", "
				+ caineLucrator.getSex() + ", " + caineLucrator.getDateOfBirth() + ", " + caineLucrator.getCompanyOwner()
				+ ", " + caineLucrator.getAddressOfCompany() + ", " + caineLucrator.getTypeOfActivity());

	}

}
