package com.sushil;

public class Tester {
	
	public static void main(String[] args) {
		
		System.out.println("*******************Permanent Employee*******************");
		Employee e1 = new PermanentEmployee(101, "Anil", 10000.0, 1500.0, 3.0);
		e1.display();
		
		System.out.println();
		
		System.out.println("*******************Contract Employee*******************");
		Employee e2 = new ContractEmployee(102, "Ankit", 500.0, 10);
		e2.display();
		
	}

}
