package leapfinder;

import java.util.Scanner;

//Java program to check 
//for a leap year
public class LeapYearFinder {
	
	static Boolean isLeapYear(Integer year) {
		
		// If a year is multiple of 400, then it is a leap year
		if(year%400 == 0)
			return true;
		
		// Else If a year is multiple of 100, then it is not a leap year 
		if(year%100 == 0)
			return false;
		
		// Else If a year is multiple of 4, then it is a leap year 
		if(year%4 == 0)
			return true;
		
		//If none of the conditions are satisfied then its certainly not a leap year
		return false;
		
	}
	
	static Boolean isLeapEfficient(Integer year) {
		
		// Return true if year is a multiple 
	    // of 4 and not multiple of 100. 
	    // OR year is multiple of 400.
		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the year in number, to check if it's a Leap Year or not");
		
		Integer year = sc.nextInt();
		
		String output = "The year " + year.toString() + (LeapYearFinder.isLeapEfficient(year) ? " is a Leap Year!" : " isn't a Leap Year!");
		
		System.out.println(output);
		
	}

}
