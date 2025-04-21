import java.util.Scanner;

public class FinancialsCurrencyExchange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate = input.nextDouble();
		
		if (exchangeRate <= 0) {
			System.out.print("Exchange rate must be greater than 0");
		}
		if (exchangeRate > 0) {
			System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
			double currencyChoice = input.nextDouble();
		if (currencyChoice != 0 && currencyChoice != 1) {
			System.out.print("Invalid entry! Enter 0 or 1");
		}
		else if (currencyChoice == 0) {
			System.out.print("Enter the dollar amount: ");
			double dollarAmount = input.nextDouble();
				if (dollarAmount <= 0) {
				System.out.print("Amount must be greater than 0");
				}
				else if (dollarAmount > 0) {
					double dollarToRmb = dollarAmount * exchangeRate;
					System.out.printf("$%.2f is %.2f yuan", dollarAmount, dollarToRmb);
				}
		}
		else if (currencyChoice == 1) {
			System.out.print("Enter the RMB amount: ");
			double rmbAmount = input.nextDouble();
				if (rmbAmount <= 0) {er
				System.out.print("Amount must be greater than 0");
				}
				else if (rmbAmount > 0) {
					double rmbToDollars = rmbAmount / exchangeRate;
					System.out.printf("%.2f yuan is $%.2f", rmbAmount, rmbToDollars);
				}
		}
		}
	}
}