import java.util.Scanner;

public class ThirdLoopMysteryGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int compInput = (int)((Math.random() * 10) + 1);
		
		System.out.print("The genius machine picked a mystery number between 1 and 10, guess it: ");
		int number = input.nextInt();

		int count = 1;

		while (number != compInput) {
			if(count % 3 == 0 && number != compInput) {
				compInput = (int)((Math.random() * 10) + 1);
				System.out.print("\nThe mystery number has now changed");
				if (number > compInput) {
					System.out.print("\nTry taking a guess again: ");
					number = input.nextInt();
				count++;
				}
				else if (number < compInput) {
					System.out.print("\nTry taking a guess again: ");
					number = input.nextInt();
				count++;
				}
			}
			else if (number > compInput) {
				System.out.print("\nWrong, you guessed higher. Try Again: ");
				number = input.nextInt();
			count++;
			}
			else if (number < compInput) {
				System.out.print("\nWrong, you guessed lower. Try Again: ");
				number = input.nextInt();
			count++;
			}
			
			
		}
			System.out.println("\nCongratulations. The genius machine also picked " + compInput);
			System.out.println("Your number of guesses were " + count);
			
	}
}
		
		
		
		