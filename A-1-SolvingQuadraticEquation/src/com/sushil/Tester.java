package com.sushil;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println("********* a=1 b=4 c=4 *********");
		QuadraticEquation q1 = new QuadraticEquation(1, 4, 4);
		q1.solution();
		
		System.out.println("********* a=2 b=5 c=2 *********");
		QuadraticEquation q2 = new QuadraticEquation(2, 5, 2);
		q2.solution();
		
		System.out.println("********* a=1 b=4 c=6 *********");
		QuadraticEquation q3 = new QuadraticEquation(1, 4, 6);
		q3.solution();
		
	}

}
