import java.util.Scanner;

public class LoopMysteryGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int compInput = (int)((Math.random() * 10) + 1);
		
		System.out.print("The genius machine picked a mystery number between 1 and 10, guess it: ");
		int number = input.nextInt();

		int count = 1;

		while (count != 3) {
			if (number > compInput) {
				System.out.print("\nWrong, you guessed higher. Try Again: ");
				number = input.nextInt();
			}
			else if (number < compInput) {
				System.out.print("\nWrong, you guessed lower. Try Again: ");
				number = input.nextInt();
			}
			count++;
		}
			if (number == compInput) {
				System.out.print("\nCongratulations. The genius machine also picked " + compInput);
			}
			else {
			System.out.printf("%nThe correct answer is %d", compInput);
			System.out.println("\nYou have failed all three attempts");
			System.out.print("Are you sure you're a genius?");
			}
	}
}
		
		
		
		