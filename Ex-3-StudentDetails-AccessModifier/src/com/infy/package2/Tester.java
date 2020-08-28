package com.infy.package2;

import com.infy.package1.Student;

public class Tester {
	public static void main(String[] args) {
		Student s1=new Student(101,"Sushil",475.0f,500.0f);
		StudentDetails d=new StudentDetails();
		d.displayStudentDetails(s1);
		d.calculatePercentage(s1);
	}
}