import java.util.*;

public class Unformatted {

	public static void main(String[] args) {
		// again going to use a different naming convention for the variables
		// declaring the variables
		final double amount1 = 13.45;
		final int amount2 = 34;
		double salary;
		int userInput;
		
		Scanner keyboard = new Scanner(System.in);
		
		// output
		System.out.println("Enter an integer *less* than 70:");
		userInput = keyboard.nextInt();
		salary = userInput * amount1;
		System.out.println("amount1 = "+ amount1);
		System.out.println("amount1 + amount2 = " + (amount1 + amount2));
		System.out.println("Wages: €" + salary);

	}

}
