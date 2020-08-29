package com.sushil;

public class QuadraticEquation {
	
	private Integer a;
	private Integer b;
	private Integer c;

	public QuadraticEquation(Integer a, Integer b, Integer c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Integer getA() {
		return a;
	}
	public void setA(Integer a) {
		this.a = a;
	}
	public Integer getB() {
		return b;
	}
	public void setB(Integer b) {
		this.b = b;
	}
	public Integer getC() {
		return c;
	}
	public void setC(Integer c) {
		this.c = c;
	}
	
	public void solution() {
		
		double discriminant = (Math.pow(this.b, 2) - (4 * this.a * this.c));
		
		double output1 = ((-1 * this.b) - Math.sqrt(discriminant)) / (2 * this.a);
		double output2 = ((-1 * this.b) + Math.sqrt(discriminant)) / (2 * this.a);
		
		if(discriminant == 0)
			System.out.println("The root is " + output1);
		
		else if(discriminant > 0)
			System.out.println("The roots are " + output1 + " and " + output2);
		
		else
			System.out.println("The equations doesn't have real roots.");
	
	}

}
