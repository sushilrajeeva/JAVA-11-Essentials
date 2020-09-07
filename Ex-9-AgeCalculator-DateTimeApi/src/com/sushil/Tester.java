package com.sushil;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your DOB in DD/MM/YYYY format.");
		String dob = sc.nextLine();
		
		AgeFinder a = new AgeFinder(dob);
		System.out.println(a.age());
		

	}

}
