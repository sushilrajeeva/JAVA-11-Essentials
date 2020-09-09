package com.sushil;

public class Point {
	
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(){
	    double x1 = this.getX();
	    double y1 = this.getY();
	    double x2 = 0,y2 = 0;
	    
	    return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	    
	}
	
	public Double distance(Point point) {
		double x1 = this.getX();
	    double y1 = this.getY();
	    double x2 = point.getX();
	    double y2 = point.getY();
	    
	    return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	}

}
