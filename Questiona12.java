package projectPackage;

public class Questiona12 {

	public static void main(String[] args) {
		
		// declaared two variables needed to pass through the method 
		boolean isHotOutside = true; 
		double moneyInPocket = 12.75; 

		// declearing the main variable that prints the result to the console
		boolean willBuyDrink = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println("Will buy a drink: " + willBuyDrink);
	}

	// Method to decide if a person will buy a drink based on weather and money parameters 
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		// statement parameters that will be used when determining the out come of the method
		return isHotOutside && moneyInPocket > 10.50;

	}

}
