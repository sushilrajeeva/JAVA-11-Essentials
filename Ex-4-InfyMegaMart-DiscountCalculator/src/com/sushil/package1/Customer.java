package com.sushil.package1;

class Customer{
	
	private String customerName;
	private int applicableDiscount;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getApplicableDiscount() {
		return applicableDiscount;
	}
	public void setApplicableDiscount(int applicableDiscount) {
		this.applicableDiscount = applicableDiscount;
	}
	
	public void findDiscountAndName(String inputString) {
		
		//write the solution as mentioned 

		String[] valArray = inputString.split(":");
		
		this.applicableDiscount = (valArray[0].equals("Regular") ? 10 : (valArray[0].equals("Privileged") ? 20 : 0));
		this.customerName = valArray[1];
		
		String output = "Hi " + this.customerName + "! " + this.applicableDiscount + "% discount is applicable for you";
		
		System.out.println(output);
		
	}
}


