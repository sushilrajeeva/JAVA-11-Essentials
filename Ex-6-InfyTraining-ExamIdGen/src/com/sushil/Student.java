package com.sushil;

public class Student {
	
	private String studentId;
	private String name;
	private String examId;

	public Student(String studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExamId() {
		return examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}
	
	public String generateExamId() {
		
		char lastChar = this.getStudentId().charAt(this.getStudentId().length()-1);
		String lastStr = Character.toString(lastChar);
		Integer lastVal = Integer.parseInt(lastStr);
		Integer square = (int) Math.pow(lastVal, 2);
		
		String[] name = this.getName().split(" ");
		String output = name[0].substring(0, 3) + "-" + name[1].substring(0, 3) + ":" + this.getStudentId() + "-" + square;
		
		return output;
				
	}

}
