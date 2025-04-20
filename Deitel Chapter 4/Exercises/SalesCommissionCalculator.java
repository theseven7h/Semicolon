import java.util.Scanner;

public class SalesCommissionCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double earnings = 200;
		int counter = 1;
		System.out.println("Item " + counter);
		System.out.print("Enter price (or 0 to quit): $");
		double value = input.nextDouble();
		
		while(value != 0) {
			value *= 0.09;
			earnings += value;
			counter++;

			System.out.println("Item " + counter);
			System.out.print("Enter price (or 0 to quit): $");
			value = input.nextDouble();
		}

		if (counter > 1) System.out.printf("Total earnings: $%.2f", earnings);
		else System.out.print("No input was entered");
	}
}