package projectPackage;

public class Questiona13 {

	public static void main(String[] args) {
		int yearToCheck = 2024; // pass any year into this variable to check if its a leap year

		
		//boolean statement and if else statement where the outcome will determine which statement is ran 
		boolean isLeapYear = isLeapYear(yearToCheck);
		if (isLeapYear) {
			System.out.println(yearToCheck + " is a leap year.");
		} else {
			System.out.println(yearToCheck + " is not a leap year.");
		}
	}

	// new method that runs the math needed to determine the outcome
	public static boolean isLeapYear(int year) {
		// Leap years occur every 4 years, but not every 100 years unless divisible by 400
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

}

// I created this method array because I am always curious abotu what years are leap years. Now I no longer have to wonder. I also now know that next year (2024) is in fact a leap year
