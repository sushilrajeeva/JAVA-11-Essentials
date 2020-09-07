package com.sushil;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AgeFinder {
	
	private LocalDate dob;
	private LocalDate today;
	
	public AgeFinder(String dob) {
		// TODO Auto-generated constructor stub
		
		this.dob = LocalDate.parse(dob, DateTimeFormatter.ofPattern("d/M/yyyy"));
		this.today = LocalDate.now();
		
	}
	
	public String age() {
		
		String msg = "";
		
		int age = (int) dob.until(today, ChronoUnit.YEARS);
		
		msg += "You are " + age + " years old";
		
		return msg;
	}

}
