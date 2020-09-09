package com.sushil;

public class ContractEmployee extends Employee{
	
	private Double wage;
	private Integer hours;
	
	public ContractEmployee(Integer empId, String name, Double wage, Integer hours) {
		super(empId,name,0.0);
		this.wage = wage;
		this.hours = hours;
		this.calculateSalary();
	}

	public Double getWage() {
		return wage;
	}

	public void setWage(Double wage) {
		this.wage = wage;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public void calculateSalary() {
		Double salary = this.getHours() * this.getWage();
		super.setSalary(salary);
	}

	public void display() {
		System.out.println("Contract Employee : Your salary is : " + this.getSalary());
	}
	
}
