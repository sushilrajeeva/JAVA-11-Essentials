package com.sushil;

public class SeniorTraveller extends Traveller{

	private Integer age;
	
	public SeniorTraveller(String name, String id, int age) {
		super(name, id);

		
		this.age = age;
		
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public void calculateFare() {

		
		double discount = (this.age > 65 ? 15 : (this.age >= 50 ? 10 : 0));
		
		double base = 2000;
		double disbase = base - (base * discount)/100;
		double sTax = 11.36;
		double total = disbase + (disbase * sTax)/100;
		double fare = this.age < 50 ? -1 : total;
		this.setFare(fare);
	}
	
	//No need to write this as due to dynamic polymorphism this child class will automatically inherit this method from the parent Traveller class
//	@Override 
//	public void displayDetails() {

//		super.displayDetails();
//	}

}
