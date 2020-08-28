package ideastoexplore;

public class TryWhile {

	public static void main(String[] args) {
		int pointer = 0;
		int value = 1;
		while ( true )
		{
		++pointer;
		System.out.println("Pointer = " + pointer);
		if ( pointer % 2 == 0 )
		continue; // continue will skip this interation so anything after continue wont be executed
		else if ( pointer % 5 == 0 )
		break; // break will end the loop so , the while loop stops and anything after break will not be executed
		value *= 3;
		System.out.println(value + " " + pointer);
		}
		
	}
}
	

