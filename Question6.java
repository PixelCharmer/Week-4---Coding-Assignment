package projectPackage;

public class Question6 {

	public static void main(String[] args) {
		// carrying over the code from the last question to solve this question
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; 
		int[] nameLengths = new int[names.length];
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		
		// created a counting variable called arraySum. 
		// created a forEach loop to iterate through the elements 
		// added to the counting variable as it iterated through to get the total sum
		int arraySum = 0;
		for (int length : nameLengths) {
			arraySum += length;
		}
		// printing the sum to the console
		System.out.println(arraySum);
	}

}
