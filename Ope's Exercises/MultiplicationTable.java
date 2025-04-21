import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		int times = 0;
	
		for(int row = 10; row >= 1; row--) {
			long product = 0;
			times++;
			for(int num = 1; num <= 1; num++) {
				product = number * times;
					System.out.printf("%-8d%-8s%-8d%-8s%-8d", number, "x", times, "=", product);
			}
		System.out.println();
		}
	}
}