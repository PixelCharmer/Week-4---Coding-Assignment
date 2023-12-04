package projectPackage;

public class Question9 {

	public static void main(String[] args) {
		// declared a new int array which holds three elements 
		int [] numbers = {30, 45, 23};
		
		
		// declared a new boolean variable with a print statement to print the boolean statement to the console 
		boolean result = isSumGreaterThan100(numbers);
		System.out.println(result);
	}
	// a new boolean method which houses the main math needed to find the solution 
    public static boolean isSumGreaterThan100(int[] array) {
    	
    	// created a int sum variable that will keep the running sum total as the loop ran
    	int sum = 0;

        
    	// a forEach loop to iteraate through the array to get the total value of all the elements 
    	for (int num : array) {
            sum += num;
        }

    	//return statement checking if the sum total is greater then the value of 100
        return sum > 100;

	}

}
