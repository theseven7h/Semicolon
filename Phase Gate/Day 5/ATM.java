import java.util.Scanner;

public class ATM {
	public static String message(double balance, double amount) {		
		String message = "";
		if (amount > balance)
			message = "Insufficient funds";
		else if ((amount % 500) != 0)
			message = "Invalid amount! Withdrawals must be in multiples of N500 or N1000";
		else if (amount > (balance * 0.90))
			message = "You cannot withdraw more than 90% of your balance";
		else if (amount <= 0) 	
			message = "Amount must be greater than N0";
		else if (amount > 20000)
			message = "You cannot exceed N20000 per transaction";
		else message = "Transaction successful!";
		return message;
	}
	
	public static double withdraw(double balance, double amount) {
		String message = message(amount, balance);
		if(message.equals("Transaction successful!"));
			balance = balance - amount - 100;
		return balance;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----Welcome to THE SEVENTH ATM----\n");
		
		System.out.print("Enter your account balance (above 0): ");
		double balance = sc.nextDouble();
		
		while (balance <= 0) {
			System.out.println("Invalid! Enter your account balance (above 0): ");					balance = sc.nextDouble();
		}
		
		String log = "";
		
		while(true) {
			System.out.printf("%nYour current balance: N%,.2f%n", balance);
			
			System.out.print("\n\nEnter withdrawal amount (multiples of 500 or 1000): ");
			double amount = sc.nextDouble();
			String result = message(balance, amount);
			
			while (!result.equals("Transaction successful!")) {	
				System.out.println(result);
				System.out.println("Enter withdrawal amount (multiples of 500 or 1000): ");
				amount = sc.nextDouble();
				result = message(balance, amount);
			}
			
			balance = withdraw(balance, amount);
			String details = "" + result + "\nWithdrawal Amount: N" + amount + "\nWithdrawal Fee: N100.00\nRemaining Balance: " + balance;
			
			System.out.println();
			System.out.print(details);
			
			log += details + "\n\n"; 
			
			System.out.println();
			
			String repeat = "";
			while (true) {
				System.out.print("\nDo you wish to make another withdrawal (Yes/No): ");
				repeat = sc.next().toLowerCase().trim();
				
				if(repeat.equals("yes") || repeat.equals("no")) break;
				else System.out.println("\nInvalid! Yes/No");
			}
			
			if (repeat.equals("no")) { 
		System.out.print("\nThank you for using The Seventh Bank. Have a good day ^_^\n\n----TRANSACTION HISTORY----");
			
			System.out.print(log);
			break;
			}	
		}
	}
}