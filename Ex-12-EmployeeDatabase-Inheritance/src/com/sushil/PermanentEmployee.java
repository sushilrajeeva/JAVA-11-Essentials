package com.sushil;

public class PermanentEmployee extends Employee{
	
	private Double basicPay;
	private Double hra;
	private Double experience;
	
	public PermanentEmployee(Integer empId, String name, Double basicPay, Double hra, Double experience) {
		super(empId,name,0.0);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
		this.calculateSalary();
	}
	
	public Double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(Double basicPay) {
		this.basicPay = basicPay;
	}
	public Double getHra() {
		return hra;
	}
	public void setHra(Double hra) {
		this.hra = hra;
	}
	public Double getExperience() {
		return experience;
	}
	public void setExperience(Double experience) {
		this.experience = experience;
	}
	
	public void calculateSalary() {
		
		Double exp = this.getExperience();
		Double variableComponent = (exp<3 ? 0 : (exp<5 ? 5 : (exp<10 ? 7 : 12))) * this.getBasicPay() / 100;
		
		Double salary = variableComponent + this.getBasicPay() + this.getHra();
		super.setSalary(salary);
		
	}
	
	public void display() {
		
		System.out.println("Permanent Employee : Your Salary is : " + this.getSalary());
		
	}

}
