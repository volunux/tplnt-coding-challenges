package com.tplnt.programming_algo;

import java.util.Scanner;

public class Question1 {
	
	
	/**
	 * Given the time in numerals, we convert it into words as shown below.
	 * <pre>
	 * 5:00 ⇒ five o’clock 
	 * 5:01 ⇒ one minute past five
	 * 5:10 ⇒ ten minutes past five
	 * 5:30 ⇒ half past five
	 * 5:40 ⇒ twenty minutes to six
	 * 5:45 ⇒ quarter to six
	 * 5:47 ⇒ thirteen minutes to six
	 * 5:28 ⇒ twenty-eight minutes past five
	 * <pre>
	 * @param hour The hour of times in number or integer
	 * @param the minute of times in number or integer
	 * @return Nothing
	 */
	public static void timesInWords(int hour, int minutes) {
	    if (hour < 1 || hour > 12) { 
	        throw new IllegalArgumentException("Hour cannot be less than 1 or greater than 12"); 
	    }
	    else if (minutes < 0 || minutes > 60) {
	        throw new IllegalArgumentException("Minute cannot be less than 0 or greater than 60");
	    }
	    
	    String[] numberWords = new String[] {
                "",
                "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", 
                "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty-one", "twenty-two",
                "twenty-three", "twenty-four", "twenty-five", "twenty-six", "twenty-seven", "twenty-eight", "twenty-nine" };
	    
	    int nextHour = (hour % 12) + 1;
        
        if (minutes == 0) {
            System.out.printf("%s o'clock\n", numberWords[hour]);
        }
        
        else if (minutes == 15) {
            System.out.printf("quarter past %s\n", numberWords[hour]);
        }
        
        else if (minutes == 30) {
            System.out.printf("half past %s\n", numberWords[hour]);
        }
        
        else if (minutes == 45) {
            System.out.printf("quarter to %s\n", numberWords[nextHour]);
        }
        
        else if (minutes < 30) {
            System.out.printf("%s %s past %s\n", numberWords[minutes], (minutes == 1 ? "minute" : "minutes" ), numberWords[hour]);
        }
        
        else {
            System.out.printf("%s minutes to %s\n", numberWords[60 - minutes], numberWords[nextHour]);
        }
	}
	
	public static void main(String...args) {
		
		try(Scanner scanner = new Scanner(System.in);) {

			System.out.println("Enter hour....");
			int hour = scanner.nextInt();
			System.out.println("Enter minutes...");
			int minutes = scanner.nextInt();
			
			timesInWords(hour, minutes);
		}
	}

}
