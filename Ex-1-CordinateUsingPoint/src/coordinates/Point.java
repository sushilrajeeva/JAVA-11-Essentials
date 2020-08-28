package coordinates;

class Point {
	
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
	
	//Method to obtain distance of a point w.r.t origin
	public double distance(){
	    double x1 = this.getX();
	    double y1 = this.getY();
	    double x2 = 0,y2 = 0;
	    
	    return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	    
	}
	
	//Method to obtain distance of a point w.r.t another point
	public double distance(Point point){
		double x1 = this.getX();
	    double y1 = this.getY();
	    double x2 = point.getX();
	    double y2 = point.getY();
	    
	    return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	    
	}

}
class Tester {
	public static void main(String[] args) {
	    //code here
		System.out.println("*********************************************");
		
		System.out.println("Distance from origin example");
		
		double x1 = 2;
		double y1=3;
		
		System.out.println("X = " + x1);
		System.out.println("Y = " + y1);
		
		Point p1 = new Point(x1, y1);
		
		double distanceFromOrigin = p1.distance();
		
		System.out.println("The distance of p1 from origin = " + distanceFromOrigin);
		
		
		System.out.println("*********************************************");
		
		System.out.println("Distance between two points example");
		
		double x2 = 5;
		double y2 = 6;
		
		Point p2 = new Point(x2, y2);
		
		double distanceBetweenPoints = p1.distance(p2);
		
		System.out.println("The distance of p1 from p2 = " + distanceBetweenPoints);
		
		
    		
	}
}
