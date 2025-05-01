import java.util.Scanner;

public class PalindromeThreeDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println();

		System.out.print("Enter a three-digit integer: ");
		int number = input.nextInt();
		
		int printNumber = number;
		int rem = 0;
		int numberReversed = 0;
		for (int count = 1; count <= 3; count++) {
			rem = number % 10;
			numberReversed = (numberReversed * 10) + rem;
			number /= 10; 	
		}
		if (numberReversed == printNumber) System.out.println(printNumber + " is a palindrome");
		else if (numberReversed != printNumber) System.out.print(printNumber + " is not a palindrome");
		
		System.out.println();
	}
}