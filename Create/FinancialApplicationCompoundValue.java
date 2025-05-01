import java.util.Scanner;

public class FinancialApplicationCompoundValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount: ");
		double amount = input.nextDouble();

		System.out.print("Enter the annual interest rate: ");
		double annualInterestRate = input.nextDouble();

		System.out.print("Enter the number of months: ");
		int months = input.nextInt();

		double compoundValue = 0;
		int count = 1;
		for (int t = 1;t <= months; t++) {
			compoundValue = (amount + compoundValue) * (1 + ((annualInterestRate / 100) / 12));
			System.out.printf("Compound value after month %d is %.3f%n", count, compoundValue);
			count++;
		}
	}
}
			