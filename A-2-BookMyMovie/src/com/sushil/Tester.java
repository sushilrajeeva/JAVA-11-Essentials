package com.sushil;

public class Tester {

	public static void main(String[] args) {
		
		String message = "The total amount for booking: ";
		
		System.out.println("*********Object1 -> id = 101 tickets = 5 ****************");
		BookMyMovie b1 = new BookMyMovie(101, 5);
		System.out.println(message + b1.calculateTicketAmount());
		
		
		System.out.println("*********Object2 -> id = 102 tickets = 4 ****************");
		BookMyMovie b2 = new BookMyMovie(102, 4);
		System.out.println(message + b2.calculateTicketAmount());
		
		
		
		System.out.println("*********Object3 -> id = 103 tickets = 8 ****************");
		BookMyMovie b3 = new BookMyMovie(103, 8);
		System.out.println(message + b3.calculateTicketAmount());
	}

}
