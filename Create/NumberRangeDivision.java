import java.util.Scanner;

public class NumberRangeDivision {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter the second number: ");
		int secondNumber = input.nextInt();
		int printSecondNumber = secondNumber;

		System.out.print("Enter the desired denominator: ");
		int denominator = input.nextInt();

		int count = 0;

		for (;secondNumber <= firstNumber; secondNumber++) {
			if (secondNumber % denominator == 0) count++;
		}
		
		System.out.print("The numbers divisible by " + denominator + " between " + printSecondNumber + " and " + firstNumber + " are " + count);
	}
}