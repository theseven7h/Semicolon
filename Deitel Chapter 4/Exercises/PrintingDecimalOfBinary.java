import java.util.Scanner;

public class PrintingDecimalOfBinary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a binary number: ");
		int number = input.nextInt();
		int decimal = 0;
		int power = 1;
		System.out.print(number);
		while (number != 0) {	
			int binary = number % 10;
			decimal += (binary * power);
			power *= 2;
			number /= 10;
		}
		System.out.print(" decimal equivalent is " + decimal);
	}
}
		