import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = input.nextInt();
		System.out.printf("The factors of %d are: ", number);
		
		for (int check = 1 ;check <= number; check++) {
			if (number % check == 0) System.out.printf("%d, ", check);
		}
	}
} 