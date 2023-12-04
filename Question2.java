package projectPackage;

public class Question2 {

	public static void main(String[] args) {
		// created an string array using the same process as before but changed the type to String[]
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; 
				
		// Used the same process of iterating through the array with a forEach loop and counter variable 
		int totalLetters = 0;
		for (String name : names) {
		   totalLetters += name.length();
		}
		
		// Same procss as before of calculating the average of an arrays elements values 
		double averageLetters = (double) totalLetters / names.length;
		System.out.println(averageLetters);
		        
		
		// Looped through the array again with a forEach loop but this time its to concatenate the strings into 1 new string
		// started with a empty string that will concatenate the elements as the loop runs 
		String concatenatedNames = "";
		for (String name : names) {
		    concatenatedNames += name + " ";
		}
		            
		// Remove the trailing whitespace
		concatenatedNames = concatenatedNames.trim();
		            
		 
		//printing the new concatenated string value to the console
		System.out.println(concatenatedNames);
		 

	}

}
