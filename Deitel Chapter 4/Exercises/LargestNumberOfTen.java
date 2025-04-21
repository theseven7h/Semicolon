import java.util.Scanner;

public class LargestNumberOfTen {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = input.nextInt();
		int largest = -2000000;

		for(int count = 1; count <= 9; count++) {
			if (number > largest) largest = number;

			System.out.print("Enter number: ");
			number = input.nextInt();
		}
		System.out.println("Largest number is " + largest);
	}
}