package com.infy.package1;

public class Student {

	Integer studentId;
	public String studentName;
	private Float totalMarksObtained;
	public Float totalMarks;
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public Float getTotalMarksObtained() {
		return totalMarksObtained;
	}
	public void setTotalMarksObtained(Float totalMarksObtained) {
		this.totalMarksObtained = totalMarksObtained;
	}
	
	public Student(Integer studentId, String studentName, Float totalMarksObtained, Float totalMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.totalMarksObtained = totalMarksObtained;
		this.totalMarks = totalMarks;
	}

}
