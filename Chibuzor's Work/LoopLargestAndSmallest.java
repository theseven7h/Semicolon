import java.util.Scanner;

public class LoopLargestAndSmallest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number (or -1 to quit): ");
		int number = input.nextInt();
		int largest = number;
		int smallest = number;
		int count = 0;

		while (number != -1) {
			if (number > largest) largest = number;
			if (number < smallest) smallest = number;
			System.out.print("Enter next number (or -1 to quit): ");
			number = input.nextInt();
			count++;
		}
		if (count > 0) System.out.println("The largest number is " + largest);
		if (count > 0) System.out.println("The smallest number is " + smallest);
		if (count == 0) System.out.print("No number was entered");
	}
}