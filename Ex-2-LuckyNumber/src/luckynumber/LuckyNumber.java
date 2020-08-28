package luckynumber;

import java.util.Scanner;

public class LuckyNumber {
	
	static boolean isLucky(Integer number) {
		
		boolean flag = false;
		
		String temp = number.toString();
		
		int[] numArray = new int[temp.length()];
		
		for(int i=0; i<temp.length(); i++) {
			numArray[i] = temp.charAt(i);
		}
		
		int sum = 0;
		
		for(int i=1; i<numArray.length; i++) {
			if(i%2 != 0)
				sum += Math.pow(numArray[i], 2);
		}
		
		if(sum%9 == 0)
			flag = true;
		
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number to check if it's lucky or not: ");
		
		Scanner sc = new Scanner(System.in);
		Integer number = sc.nextInt();
		
		String output = (isLucky(number) ? "Congrats! the number " + number + " is Lucky!!" : "Oops! the number " + number + " insn't Lucky!!");
		
		System.out.println(output);

	}

}
