package ideastoexplore;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		//declaring Array
		int[] numArr = {6,8,9,10,40,66};
		
		//searching element 40 in the array
		//binarySearch will return index of the element found
		//will return a negative index if the element is not found
		int resultIndex = Arrays.binarySearch(numArr, 40);
		System.out.println(resultIndex);
		
		//comparing arrays
		int[] numArr1 = {6,8,9,10,40,66};
		int[] numArr2 = {6,8,9,10,40,66};
		boolean resultCompare = Arrays.equals(numArr1, numArr2);
		System.out.println(resultCompare);//return true or false
		
		//printing elements of an array
		int[] numArr3 = {6,8,9,10,40,66};
		Arrays.sort(numArr3);
		System.out.println(Arrays.toString(numArr3));
		
	}
	
}
