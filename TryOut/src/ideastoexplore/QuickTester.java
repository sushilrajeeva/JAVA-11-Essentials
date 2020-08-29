package ideastoexplore;

public class QuickTester {

	public enum Enums
	{
	    FIRST, SECOND, THIRD;
	}
   public static void main(String[] args)
   {
       Enums[] myEnums = new Enums[3];
  
       for (int i = 0; i < myEnums.length; i++)
       {
           System.out.println(myEnums[i]);
       }
   }
	
}
