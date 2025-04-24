import java.util.Scanner;

public class FindTheHighestScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int students = input.nextInt();
		
		String winner = "";

		int highest = 0;
		int count = 1;

		for (;count <= students; count++) {
			
			System.out.print("\nEnter next student's name: ");
			String name = input.next();

			System.out.print("Enter the student's score: ");
			int score = input.nextInt();

			if (score > highest) {
				winner = name;
				highest = score;
			}
		}

		System.out.print(winner + " has the highest score of " + highest);
	}
}
		
		