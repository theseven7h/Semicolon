import java.util.Scanner;

public class DisplayCalendars {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the year: ");
		int year = input.nextInt();

		System.out.print("Enter first day of the year: ");
		int firstDay = input.nextInt();
		int num = firstDay;

		int cal;

		for (int row = 5; row >= 1; row--) {
			for (;firstDay <= 7; firstDay++) {
				System.out.print("  ");
			}
			for (cal = 7 -  num; cal <= 7;) {
				System.out.print(" " + cal);
			}
			System.out.println();
			if (cal == 5) System.out.println();
		}
	}
}
		