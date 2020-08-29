package com.sushil;

public class CricketScore {
	
	public static void main(String[] args) {
		
		int[] scores = {281, 344, 265, 272, 236, 324, 287};
		
		double average = 0, sum = 0;
		
		for (int i : scores) {
			sum += i;
		}
		
		average = sum/scores.length;
		
		System.out.println("The average score of the team is : " + average);
		
		int below=0,equal=0,above=0;
		
		for (int i : scores) {
			if(i<average)
				below++;
			else if(i==average)
				equal++;
			else
				above++;
		}
		
		System.out.println("No. of matches having score above average is " + above);
		System.out.println("No. of matches having score equal average is " + equal);
		System.out.println("No. of matches having score below average is " + below);
		
	}
	
	

}
