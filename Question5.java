package projectPackage;

public class Question5 {

	public static void main(String[] args) {
		// simply carrying over the names array again 
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; 
		
		// Created a new array to store the lengths of the elements within the names array
		int[] nameLengths = new int[names.length];
		
		// Using a standard for loop to iterate through the names array and populate the number of letters in each name into the newly created array
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		// printing the new nameLengths length to the console
		System.out.println(nameLengths.length);
	}

}
