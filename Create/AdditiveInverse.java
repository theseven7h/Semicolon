import java.util.Scanner;

public class AdditiveInverse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		double number = input.nextDouble();
		number = -number;
		if (number % 1 == 0) System.out.printf("%.0f", number);		else System.out.print(number);
	}
}