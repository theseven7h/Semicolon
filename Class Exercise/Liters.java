import java.util.Scanner;

public class Liters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println();

		System.out.print("Please, input your budget: ");
		double budget = input.nextDouble();

		final double pricePerLiter = 855.00;
		double liters = budget / pricePerLiter;
	
		System.out.printf("%.2fnaira will get you %.2f liters", budget, liters);
	}
}