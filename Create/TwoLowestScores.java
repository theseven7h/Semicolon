import java.util.Scanner;

public class TwoLowestScores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int students = input.nextInt();
		
		int lowest = 2000000;
		int lowest2 = 2000000;
		String name1 = "";
		String name2 = "";
		
		for (;students >= 1; students--) {
			System.out.print("\nEnter student's name: ");
			String name = input.next();

			System.out.print("Enter the student's score: ");
			int score = input.nextInt();

			if (score < lowest) {
				lowest2 = lowest;
				name2 = name1;

				lowest = score;
				name1 = name;
			}
			else if (score < lowest2) {
				name2 = name;
				lowest2 = score;
			}
		}
		System.out.printf("%n%s has the lowest score of %d%n", name1, lowest);	
		System.out.printf("%s has the second lowest score of %d%n", name2, lowest2);
		
	}
}