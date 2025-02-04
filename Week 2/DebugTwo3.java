// Demonstrates remainder and output
public class DebugTwo3 {

	public static void main(String[] args) {
		// going to use the num naming conventions here again
		double num1, num2, result;
		/*
		 * as int can't store the value, turned it into a string to display the number
		 * could also use the 'long' data type but fur this will turn it into a String*/
		String num3; 
		
		// declared the variables
		num1 = 99;
		num2 = 8;
		num3 = "7777777777777";
		result = num1 % num2;
		
		// output
		System.out.println("Divide " + num1 + " by " + num2);
		System.out.println("Remainder is " + result);
		
		//Added all into one line for more efficency
		System.out.println("num3 is a very large number: " +num3);

	}

}
