import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number to convert to binary: ");
		int number = input.nextInt();

		
		for (;number != 1;) {
			number = number / 2;
			for (int count = 1; count <= 1; count++) {
				int act = number % 2;
				System.out.printf("%d ", act);
			}
		}
	}
}