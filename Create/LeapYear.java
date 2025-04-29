import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter any year: ");
		int year = input.nextInt();

		while (year != 0) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
				System.out.print(year + " is a leap year\n\n");
			}
			else System.out.print(year + " is not a leap year\n\n");
			System.out.print("Enter any year: ");
			year = input.nextInt();
		}
		if (year == 0) System.out.print("No year was entered");
	}
}

			