import java.util.Scanner;

public class MonthlyPaymentValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the principal amount: ");
		double principalAmount = input.nextDouble();

		System.out.print("Enter the annual interest rate: ");
		double annualInterestRate = input.nextDouble();

		System.out.print("Enter the duration in years: ");
		double durationInYears = input.nextDouble();

		double monthlyInterestRate = annualInterestRate / 100 / 12;
		double numberOfMonths = durationInYears * 12;

		double monthlyPaymentValue = principalAmount * (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfMonths)) / ((Math.pow(1 + monthlyInterestRate, numberOfMonths)) - 1));
System.out.printf("Your monthly payment is $%,.2f ", monthlyPaymentValue);
	}
}