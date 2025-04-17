import java.util.Scanner;

public class LoopCreditLimit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int customerCount = 1;
		System.out.println("Customer " + customerCount + ": ");
		
		System.out.print("Enter the account number or 0 to quit: ");
		int acctNo = input.nextInt();

		while (acctNo != 0) {
			System.out.print("Enter the beginning balance: $");
			int beginningBalance = input.nextInt();
			System.out.print("Enter the total charges: $");
			int totalCharges = input.nextInt();
			System.out.print("Enter the total credit: $");
			int totalCredit = input.nextInt();
			System.out.print("Enter the allowed credit limit: $");
			int allowedCredit = input.nextInt();

			int newBalance = (beginningBalance + totalCharges) - totalCredit;
			System.out.printf("New balance: $%,d", newBalance);

			if (newBalance > allowedCredit) {
				System.out.print("\nCredit limit exceeded");
			}
			else {
				System.out.print("\nLimit not exceeded");
			}
			customerCount++;
			
			System.out.println("\n\nCustomer " + customerCount + ": ");
			System.out.print("Enter the account number or 0 to quit: ");
				acctNo = input.nextInt();
		}
	}
}

			