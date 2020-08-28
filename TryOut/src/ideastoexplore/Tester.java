package ideastoexplore;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("***************** A Class *****************");
		//Testing working of parameterized and parameterless constructors
		A a1 = new A();
		
		A a2 = new A("Sushil");
		
		System.out.println("***************** Pizza Class *****************");
		//Testing pizza class
		Pizza p1 = new Pizza("Medium",4);
		Pizza p2 = new Pizza("Large", 2);
		Pizza[] pizzaOrdered = {p1, p2};
		float totalCost = p1.calculateTotalPrice(pizzaOrdered);
		System.out.println("Your order is ready! Your bill amount is: "+totalCost);
		
		System.out.println("***************** B Class *****************");
		//Testing working of parameterized and parameterless constructors
		B b1 = new B();
		
		B b2 = new B("Sushil");

	}

}
