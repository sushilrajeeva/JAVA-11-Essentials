package com.sushil.package1;

class Tester{
	public static void main(String[] args) {
		Customer customer1 = new Customer();  //regular
		Customer customer2 = new Customer(); //privileged
		
		//write the code to implement the solution
		System.out.println("*****************Regular*******************");
		customer1.findDiscountAndName("Regular:Jack");
		System.out.println("*****************Privileged*******************");
		customer2.findDiscountAndName("Privileged:Mary");
	}
}
