package com.sushil;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud1 = new Student("4596", "John Whedon");
		Student stud2 = new Student("3412", "Ross Stark");
		
		System.out.println("Exam Ids are: ");
		System.out.println(stud1.generateExamId());
		System.out.println(stud2.generateExamId());

	}

}
