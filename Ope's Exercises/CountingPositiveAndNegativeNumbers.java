import java.util.Scanner;

public class CountingPositiveAndNegativeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println();
		int positive = 0;
		int negative = 0;
		double average = 0;
		double total = 0;

		System.out.print("Enter an integer, the input ends if it is 0: ");
		int number = input.nextInt();

		while (number != 0) {
		if (number > 0) positive++;
		else if (number < 0) negative++;
		total += number;
		number = input.nextInt();
		}

		if (total == 0) System.out.println("No numbers are entered except 0");
		else if (total != 0) {
			average = total / (positive + negative);
			System.out.println("The number of positives is " + positive);
			System.out.println("The number of negatives is " + negative);
			System.out.printf("The total is %.1f%n", total);
			System.out.printf("The average is %.2f%n", average);
		}
	}
}

		

