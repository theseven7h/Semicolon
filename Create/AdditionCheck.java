import java.util.Scanner;

public class AdditionCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		int userAnswer;
		
		do {
		int firstNumber = (int)(Math.random() * 100);
		int secondNumber = (int)(Math.random() * 100);

		System.out.printf("%d + %d = ?%n", firstNumber, secondNumber);
		System.out.print("-1 to quit\n");
		userAnswer = input.nextInt();

		if (userAnswer == -1) break;
		int sum = firstNumber + secondNumber;

		boolean answer = userAnswer == sum;
		System.out.print(answer);
		System.out.println();
		System.out.println();
		} while(userAnswer != -1);
	}
}