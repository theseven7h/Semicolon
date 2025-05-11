import java.util.Scanner;

public class AssignGrades {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		int[] scores = new int[numberOfStudents];
		int bestScore = Integer.MIN_VALUE;
		
		System.out.printf("Enter %d score(s): ", numberOfStudents);
		for (int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt(); 
			if (scores[i] > bestScore) bestScore = scores[i]; 
		}
			String grade = "";
			
		for (int j = 0; j < scores.length; j++) {
			if (scores[j] >= bestScore - 10) grade = "A";
			else if (scores[j] >= bestScore - 20) grade = "B";
			else if (scores[j] >= bestScore - 30) grade = "C";
			else if (scores[j] >= bestScore - 40) grade = "D";
			else grade = "F";
			
			System.out.printf("Student %d score is %d and grade is %s%n", j + 1, scores[j], grade);
		}
	}
}