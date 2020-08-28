package com.sushil.exercise;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Input for Student");
		String firstName = "    Sushil    ";
		System.out.println("First Name : " + firstName);
		String middleName = "";
		System.out.println("Middle Name : " + middleName);
		String lastName = "    Rajeev";
		System.out.println("Last Name : " + lastName);
		
		Student student = new Student();
		student.setFirstName(firstName);
		student.setMiddleName(middleName);
		student.setLastName(lastName);
		
		System.out.println("Output Generated Initials");
		System.out.println(student.generateInitials());
		
	}

}
