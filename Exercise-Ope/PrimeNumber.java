import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();
		int counter = number;
		int num = number;
		int numCount = 0;

		while (counter != 0) {
			int check = number % counter;
			if (check == 0) numCount++;
			counter--;
		}

		if (numCount == 2) {
			System.out.printf("%d is a prime number", num);
		} 
		else {
			System.out.printf("%d is not a prime number", num);
		}
	}
}
			