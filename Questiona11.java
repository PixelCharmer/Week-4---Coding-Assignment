package projectPackage;

public class Questiona11 {

	public static void main(String[] args) {
		// declared two double arrays with the values passed in
		double[] array1 = {12.5, 18.3, 25.7, 14.2}; 
		double[] array2 = {8.2, 15.4, 20.1, 10.8};  

		
		// declaring the boolean statement that answers the prompt followed by its print statment 
		boolean result = compareAverages(array1, array2);
		System.out.println(result);
	}

	// Method to compare the averages of two arrays using conditional operands 
	public static boolean compareAverages(double[] array1, double[] array2) {
		double average1 = calculateAverage(array1);
		double average2 = calculateAverage(array2);

		return average1 > average2;
	}

	// Method using the same math I have been using to find the average of an arrays elements 
	public static double calculateAverage(double[] array) {
		if (array.length == 0) {
			// This if statement and return statement handles the case when the array is empty to avoid division by zero
			return 0.0;
		}
		
		// the rest of the math is the same math i have been using to find the averages  
		double sum = 0;

		for (double num : array) {
			sum += num;
		}

		return sum / array.length;

	}

}
