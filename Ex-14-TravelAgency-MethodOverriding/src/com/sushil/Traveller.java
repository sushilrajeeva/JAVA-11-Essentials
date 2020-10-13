package com.sushil;

public class Traveller {
	
	private String name;
	private String id;
	private Double fare;
	/**
	 * @param name
	 * @param id
	 */
	public Traveller(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
	
	public void calculateFare() {
		double base = 2000;
		double sTax = 11.36;
		double nFare = base + (base * sTax)/100;
		this.setFare(nFare);
	}
	
	public void displayDetails() {
		
		this.calculateFare();
		
		System.out.println("Traveller Details");
		System.out.println("*****************");
		System.out.println("Traveller Name	:	" + this.getName());
		System.out.println("Traveller ID	:	" + this.getId());
		System.out.println("Cost of Travel	:	" + this.getFare()); 
		
	}

}
