package projectPackage;

public class Question7 {

	// adjusted the method stub to create a stirng method that takes two parameters
	public static String repeatWord(String word, int n) {
		
		//creating a string builder variable 
		StringBuilder result = new StringBuilder();
		
		// a for loop the concatenate the word string n number of times
		for (int i = 0; i < n; i++) {
			result.append(word);
		}
		
		// a return statment with holding the newly concatenated string 
		return result.toString();
	}
	
	
	// a new mehtod to pass the parmaters through to be used in the above method 
	public static void main(String[] args) {
        // Samples parameters that can be used above 
        String inputWord = "Hello";
        int repetitionCount = 3;

        // a new string varaiable that can pass the above variables to the above method 
        String concatenatedString = repeatWord(inputWord, repetitionCount);

        // print statement to print the newly concatenated string to the console 
        System.out.println(concatenatedString);
	}
		

}
