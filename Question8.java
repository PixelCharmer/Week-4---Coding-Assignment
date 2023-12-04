package projectPackage;

public class Question8 {

	public static void main(String[] args) {
		
		// declaring the variables to be used in the fullName method 
		String firstName = "Bob";
		String lastName = "Ross";
		
		// creating the a new method that will concatenate the above variables into one string 
		String fullName = createFullName(firstName, lastName);
		System.out.println(fullName);
	}
	// Method to create a full name from first name and last name variables followed by a return statement returning the new string
    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

}
