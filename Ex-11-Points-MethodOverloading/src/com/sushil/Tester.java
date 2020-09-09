package com.sushil;

public class Tester {

	public static void main(String[] args) {
		
		Point p1 = new Point(2,3);
		
		
		System.out.println("The distance of Point p1 from Origin is : " + p1.distance());
		
		Point p2 = new Point(5,6);
		
		
		System.out.println("The distance of p1 from p2 is : " + p2.distance(p1));

	}

}
