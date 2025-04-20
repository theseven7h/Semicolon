import java.util.Scanner;

public class MysteryGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int compInput = (int)((Math.random() * 10) + 1);
		
		System.out.print("Take a guess between 1 and 10: ");
		int number = input.nextInt();

		if (number == compInput) {
			System.out.print("Correct");
		}
		else { 
		if (number > compInput) {
			System.out.print("Wrong, you guessed higher");
		}
		if (number < compInput) {
			System.out.print("Wrong, you guessed lower");
		}

		System.out.print("\nTake another guess between 1 and 10: ");
		number = input.nextInt();

		if (number == compInput) {
			System.out.print("Correct");
		}
		else {
		if (number > compInput) {
			System.out.print("Wrong, you guessed higher");
		}
		if (number < compInput) {
			System.out.print("Wrong, you guessed lower");
		}

		System.out.print("\nTake another guess between 1 and 10; ");
		number = input.nextInt();

		if (number == compInput) {
			System.out.print("Correct");
		}
		if (number > compInput) {
			System.out.print("Wrong, you guessed higher");
			System.out.printf("%nThe correct answer is %d", compInput);
			System.out.println("\nYou have failed all three attempts");
		}
		if (number < compInput) {
			System.out.print("Wrong, number guessed lower");
			System.out.printf("%nThe correct answer is %d", compInput);
			System.out.println("\nYou have failed all three attempts");
		}
		}
		}
	
	}
}
		
		
		
		