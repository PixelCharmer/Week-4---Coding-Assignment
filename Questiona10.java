package projectPackage;

public class Questiona10 {

	public static void main(String[] args) {
		// another method of creating an int array and finding the average of all the elements within the array 
		// this first method is the where things are declared - the math is in the bottom method 
		double[] numbers = {12.5, 18.3, 25.7, 14.2};
		
		double average = calculateAverage(numbers);
		System.out.println(average);
	}
	
	//new method which houses the math to calculate the average just like previous methods I did to find the average before 
	public static double calculateAverage(double[] array) {
		if (array.length == 0) {
		return 0.0;
		}
		
		double sum = 0;
		
		for (double num :array) {
			sum += num;
		}
		
		return sum/array.length; 
		

	}

}
