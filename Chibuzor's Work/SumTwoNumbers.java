import java.util.Scanner;

public class SumTwoNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sum = 0;
		int choice = 1;

		do {
			System.out.print("Enter first number: ");
			int firstNumber = input.nextInt();
			System.out.print("Enter second number: ");
			int secondNumber = input.nextInt();
			sum = firstNumber + secondNumber;

			System.out.printf("Sum of the two numbers is %d%n", sum);
		
			System.out.print("\nDo you wish to perform the operation again? Enter 1 (yes) or 0 (no)): ");
			choice = input.nextInt();
		} while (choice == 1); 
	}
}
			