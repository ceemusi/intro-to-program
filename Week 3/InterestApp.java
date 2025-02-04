/* InterestApp
 * C Musitongo
 * 04 Feb 2025
 */

import java.util.Scanner;
public class InterestApp {

	public static void main(String[] args) {
		
		// Declaring variables & constants
		final double INTERESTRATE = 0.05;
		int months;
		double loanAmount;
		double totalInterest;
		double interestOwed;
		double repayAmount;
		
		
		// User Input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the loan amount.");
		loanAmount = input.nextDouble();
		
		System.out.println("How many months did you have the loan for?");
		months = input.nextInt();
		
		input.close();
		
		// Process
		totalInterest = (loanAmount * INTERESTRATE * months);
		repayAmount = (totalInterest + loanAmount);
		
		// Output
		System.out.println("Interest owed: €" + totalInterest);
		System.out.println("Repayment due: €" + repayAmount);

	}

}
