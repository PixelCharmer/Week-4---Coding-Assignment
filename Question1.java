package projectPackage;

public class Question1 {

	public static void main(String[] args) {
		// created an array by declaring the array type with square brackets and the array elements in curly brackets 
		int[] ages =  {3, 9, 23, 64, 2, 8, 28, 93};
		// printing the outcome of the last element minus the value of the first element
		// to access the last element I utilized the .length - 1 method
		// to access the first element I simply used the 0 index 
		System.out.println(ages[ages.length - 1] - ages[0]);
		
		
		// created another array using the same steps listed above
		int[] ages2 =  {5, 7, 19, 27, 36, 42, 54, 68, 71};
		// same subtraction process as above 
		System.out.println(ages2[ages2.length - 1] - ages2[0]);
		
		
		// created a counter variable to hold the running total and created a forEach loop to iterate through the array
		// each time it loops it will add the total to the counter variable 
		int counter = 0;
		for (int age : ages) {
			counter += age;
		}
		
		// calcuatlating the avrage by taking the total from the counter and diving it by the length of the ages array
		double average = (double) counter / ages.length;

		
		// prints the average to the console
		System.out.println(average);   

	}	

}

