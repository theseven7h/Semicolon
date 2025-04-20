import java.util.Scanner;

public class NumbersPower {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number (base): ");
		int result = input.nextInt();
		System.out.print("Enter second number (power): ");
		int power = input.nextInt();
		int base = result;
		int count = 1;
		
		while (count != power) {
			result *= base;
			count++;
		}
		System.out.printf("%n%d raised to the power of %d is %d", base, power, result);
	}
}
						