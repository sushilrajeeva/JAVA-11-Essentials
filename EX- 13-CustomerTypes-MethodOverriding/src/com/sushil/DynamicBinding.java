package com.sushil;

public class DynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		RegularCustomer regCust1 = new RegularCustomer();
		RegularCustomer regCust2 = new RegularCustomer();
		PremiumCustomer premCust1 = new PremiumCustomer();
		
		showCustomerDetails(regCust1);
		showCustomerDetails(premCust1);
		showCustomerDetails(regCust2);
		
	}
	
	public static void showCustomerDetails(Customer customer) {
		customer.display();
	}

}
