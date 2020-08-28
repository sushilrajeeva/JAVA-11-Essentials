package ideastoexplore;

public class TryFor {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		for (int var = 0; var < 5; var++) {
			System.out.println("Iteration ---> " + var);
			System.out.println("Num1 = " + num1 + " and Num2 = " + num2);
			if ((++num1 > 2) && (++num2 > 2)) { // placement of the conditions matter, here since first statement is false the second statement doesn't get executed so till first statement becomes true second statement num2 won't be incrimented
				num1++;
			}
			System.out.println("New Num1 = " + num1 + " and New Num2 = " + num2);
		}
		System.out.println(num1 + " and " + num2);
	}
	
}
