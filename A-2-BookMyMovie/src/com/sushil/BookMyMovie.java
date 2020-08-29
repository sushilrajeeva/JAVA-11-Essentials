package com.sushil;

import java.util.Arrays;

public class BookMyMovie {
	
	private Integer movieId;
	private Integer noOfTickets;
	private Double discount;
	private Double totalAmount;
	
	public BookMyMovie(Integer movieId, Integer noOfTickets) {
		super();
		this.movieId = movieId;
		this.noOfTickets = noOfTickets;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public Integer getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(Integer noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public void calculateDiscount() {
		int[] movieIdArr1 = {101,102,103};
		int[] movieIdArr2 = {101,103};
		
		boolean condition1 = Arrays.binarySearch(movieIdArr1, this.getMovieId()) != 0;
		boolean condition2 = Arrays.binarySearch(movieIdArr2, this.getMovieId()) != 0;
		boolean condition3 = this.movieId == 102;
		
		if(condition1 && this.getNoOfTickets() < 5)
			this.setDiscount(0.0);
		
		else if(condition2 && (this.getNoOfTickets() < 10 && this.getNoOfTickets() >= 5))
				this.setDiscount(15.0);
		
		else if(condition2 && (this.getNoOfTickets() >= 10 && this.getNoOfTickets() < 15))
			this.setDiscount(20.0);
		
		else if(condition3 && (this.getNoOfTickets() >= 5 && this.getNoOfTickets() < 10))
			this.setDiscount(10.0);
		
		else if(condition3 && (this.getNoOfTickets() >= 10 && this.getNoOfTickets() < 15))
			this.setDiscount(15.0);
		else
			this.setDiscount(0.0);
		
	}
	
	public double calculateTicketAmount() {
		
		this.calculateDiscount();
		int[] movieIdArr = {101,102,103};
		int[] baseFareArr = {120,170,150};
		
		double totalAmount = 0;
		
		for(int i=0; i<movieIdArr.length; i++) {
			if(movieIdArr[i] == this.movieId) {
				totalAmount = baseFareArr[i] * this.getNoOfTickets() - (baseFareArr[i] * this.noOfTickets * (this.getDiscount()/100));
			}
		}
		
		this.totalAmount = totalAmount;
		
		return totalAmount;
	}

}
