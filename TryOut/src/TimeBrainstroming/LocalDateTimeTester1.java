package TimeBrainstroming;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class LocalDateTimeTester1 {

	public static void main(String[] args) {
/*
		Use LocalDateTime.format(DateTimeFormatter) method to format a local time to a desired string representation.

*/
			
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee yyyy-MM-dd HH:mm:ss a");
		// We can use EEEE instead of eeee 
		LocalDateTime now = LocalDateTime.now();
		/*
			now() returns the current date-time using the system clock and default time-zone
		*/
		String dateTimeString = now.format(formatter);
		System.out.println("Before Formatting :-"+now);
		System.out.println();
		System.out.println("After Formatting :-"+dateTimeString);
		
		System.out.println();
		
		// What if I want to print Tue instead of Tuesday and I want 24 hr clock instead of 12 hr clock.
		DateTimeFormatter formatterNew = DateTimeFormatter.ofPattern("eee yyyy-MM-dd HH:mm:ss");
		String newstr = now.format(formatterNew);
		System.out.println("New Format :- "+newstr);
		/*
			Similarly if I want to print the number of the day in week i.e 6 for Friday, 7 for Saturday, we'll use :-
				1. e (if we want to display single digit) like 6,7,etc.
				2. ee(if we want to display double digits) like 06,07,etc.
		
		*/
		
		/*
			LocalDateTime provides below methods which can be used to get to new localdatetime instance relative to
			available localdatetime instance.
			plusYears(),plusMonths(),plusDays(),plusHours(),plusMinutes(),plusSeconds(),plusNanos(), etc.
		
		*/
		
		System.out.println();
		LocalDateTime dateOne = LocalDateTime.parse("2013-04-28T22:32:38.536");
        
        LocalDateTime dateTwo = LocalDateTime.parse("2007-01-14T15:32:56.000");
         
        boolean isBefore = dateOne.isBefore(dateTwo);
        System.out.println("dateOne is before dateTwo  :: " + isBefore);
         
        boolean isAfter = dateOne.isAfter(dateTwo);
        System.out.println("dateOne is after dateTwo :: " + isAfter);
         
        boolean isEqual = dateOne.isEqual(dateTwo);
        System.out.println("dateOne is equal to dateTwo :: " + isEqual);
        
        /*

        Excercise :- Segregate each element from dateOne (for example: year,month,day...etc) using get() method and display
        
        
        */
	}

	
}
