package ideastoexplore;

public class QuickTester {

	public static void main(String[] args) {
		String word1 = "Willow", word2 = "ow";
        
        System.out.println(word1 == "Willow");
        System.out.println(word1 == ("Will"+"ow"));
        System.out.println(word1 == ("Will"+word2));
	}
	
}
