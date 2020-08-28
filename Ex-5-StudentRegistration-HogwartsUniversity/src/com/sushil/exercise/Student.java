package com.sushil.exercise;

public class Student {
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Student change() {
		
		firstName = this.firstName.strip();
		middleName = (this.middleName.strip().isBlank() ? "N.A" : this.middleName.strip());
		lastName = this.lastName.strip();
		
		Student s = new Student();
		s.firstName = firstName;
		s.middleName = middleName;
		s.lastName = lastName;
		
		return s;
		
	}
	
	public String generateInitials() {
		
		Student s = this.change();
		
		return Character.toString(s.firstName.charAt(0)) + Character.toString(s.middleName.charAt(0)) + Character.toString(s.lastName.charAt(0));
		
	}

}
