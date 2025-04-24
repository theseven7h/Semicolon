import java.util.Scanner;

public class FindTheTwoHighestScores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int students = input.nextInt();
		int highest = -200000;
		int highest2 = -200000;
		String name2 = "";
		String name1 = "";
		int count = 0;

		for (;count < students; count++) {
			
			System.out.print("\nEnter student's name: ");
			String name = input.next();

			System.out.print("Enter the student's score: ");
			int score = input.nextInt();

			if (score > highest) {
				name2 = name1;
				highest2 = highest;
				
				highest = score;
				name1 = name;
			}

			else if (score > highest2) {
				highest2 = score; 
				name2 = name;	
			}
		}

		System.out.println(name1 + " has the highest score of " + highest);
		System.out.print(name2 + " has the second highest score of " + highest2);
	}
}
		
		