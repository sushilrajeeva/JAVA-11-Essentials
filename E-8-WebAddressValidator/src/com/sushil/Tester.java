package com.sushil;

public class Tester {

	public static void main(String[] args) {
		
		String successMessage = "You have entered a valid Web address";
		String errorMessage = "You have entered an Invalid Web address";
		boolean flag = false;
		
		System.out.println("***********Input \"http://www.infosys.com\" ******************");
		WebAddressValidator w1 = new WebAddressValidator();
		flag = w1.isValidWebAddress("http://www.infosys.com");
		System.out.println(flag ? successMessage : errorMessage);
		
		System.out.println("***********Input \"http.www.infosys.au\" ******************");
		WebAddressValidator w2 = new WebAddressValidator();
		flag = w2.isValidWebAddress("http.www.infosys.au");
		System.out.println(flag ? successMessage : errorMessage);
		
	}

}
