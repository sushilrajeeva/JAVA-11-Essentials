package com.sushil;

class Tester {
	
	public static void displayCar(Car[] carArr) {
	    System.out.println("Displaying Car details");
	    
	    System.out.println("Number of cars created : " + Car.getNumberOfCars());
		System.out.println("Color of the cars : ");
		
		for (Car car : carArr) {
			System.out.println("Color of the car : " + car.getColor());
		}
	}
	
	public static void main(String[] args) {
		Car c1 = new Car("Red");
		Car c2 = new Car("Green");
		Car c3 = new Car("Blue");
		
		Car[] carArr = {c1,c2,c3};
		
		/*
			write code here to display the color
		*/
		displayCar(carArr);
		
		
		
	}
	
}
