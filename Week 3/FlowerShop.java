/* 
 * FlowerShop.java
 * C Musitongo
 * 04 Feb 2025
 */
import java.util.Scanner;
public class FlowerShop {

	public static void main(String[] args) {
		
		// Declaring constants
		final double FLOWERSCOST = 5.99;
		final double TREESCOST = 20.99;
		final double COMPOSTCOST = 7.99;
		final double WATERCANCOST = 5.99;
		double totalCost;
		
		int flowers;
		int trees;
		int compost;
		int watercan;
		
		// User Input
		Scanner input = new Scanner(System.in);
		
		// Asking the user
		System.out.println("How many flowers would you like?");
		flowers = input.nextInt();
		System.out.println("How many trees would you like?");
		trees = input.nextInt();
		System.out.println("How much compost would you like?");
		compost = input.nextInt();
		System.out.println("How many watering cans would you like?");
		watercan = input.nextInt();
		input.close();
		
		// Calculations/Processing
		totalCost = ((FLOWERSCOST * flowers) + (TREESCOST * trees) + (COMPOSTCOST * compost) + 		(WATERCANCOST * watercan));
		
		// Output
		System.out.println("Your total is: €" + totalCost);
	}

}
