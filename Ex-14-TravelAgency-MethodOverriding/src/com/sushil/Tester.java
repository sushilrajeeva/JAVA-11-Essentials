package com.sushil;

public class Tester {

	public static void main(String[] args) {


		Traveller t1 = new Traveller("Roger", "AQW1344321");
		t1.displayDetails();
		
		System.out.println();
		System.out.println("************************************************");
		System.out.println();
		
		Traveller t2 = new SeniorTraveller("Joey", " PJAMG7755TY", 70);
		t2.displayDetails();
		
	}

}
