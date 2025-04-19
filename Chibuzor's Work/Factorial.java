import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
			System.out.print("Enter a number to find its factorial value: ");
			int number = input.nextInt();		
			int factorial = number;
			int num = number;
			int count = --number;

			while (count >= 1) {
				factorial *= count;
				count--;
			}
			System.out.println("Factorial of " + num + " is " + factorial);
	}
}
			
 				
				

	