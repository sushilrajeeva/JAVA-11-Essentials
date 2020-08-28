package ideastoexplore;

public class StringDemo2 {


	public static void main(String[] args) {
		
		/*
		Task 1 :- Other String methods like toUpperCase(),toLowerCase(),isEmpty(),startsWith(),endsWith(),length()
		
		*/
		System.out.println("------------"+"Other String methods"+"------------");
		String car = "Mercedes";
		System.out.println("To upper case :- "+car.toUpperCase());
		System.out.println("To lower case :- "+car.toLowerCase());
		System.out.println();
		//Tryout different scenarios of startsWith and endsWith
		System.out.println("Check whether string starts with Merc :- "+car.startsWith("Merc"));
		System.out.println("Check whether string ends with des :- "+car.endsWith("des"));
		
		System.out.println();
		System.out.println("Check whether a string is empty");
		System.out.println("for string car :- "+car.isEmpty());
		String str = "";
		System.out.println("for string str :- "+str.isEmpty());
		System.out.println();
		
		System.out.println("To calculate length of string we use length()");
		System.out.println("Length of string car is :- "+car.length());
		System.out.println();
		/*
		Task 2 :- substring(),split(),indexOf(),trim(),replace()
		
		*/
		System.out.println("------------"+"substring(),split(),indexOf(),trim(),replace()"+"------------");
		
		String forest = "Grand Canyon National Park";
		System.out.println();
		System.out.println("substring(2,6) of string forest :- "+forest.substring(2,6));
		//It gives the characters in string from startpoint i.e 2 to 6 which is endpoint
		
		System.out.println();
		System.out.println("split() will split the string into String array based on the character given in parameter");
		String[] words = forest.split(" ");
		//It will split the string forest based on white spaces
		for(String w:words){  
			System.out.println(w);  
		}
		
		System.out.println();
		System.out.println("indexOf() returns the index of substring passed as parameter");
		System.out.println("forest.indexOf(Canyon) will give result as :- "+forest.indexOf("Canyon"));
		
		System.out.println();
		String s1 = "   Amazon ";
		System.out.println("trim() is used to remove the leading and trailing white-spaces");
		System.out.println("s.trim() will give result as :- "+s1.trim());
		
		System.out.println();
		System.out.println("replace() method replaces the string according to the given parameters");
		System.out.println("forest.replace('a','e') will give result as :- "+forest.replace("a", "e"));
		//replacing all the occurences of a to e
		
	}
	
}
