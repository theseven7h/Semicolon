import java.util.Scanner;
import java.util.InputMismatchException;

public class LeapYearMismatchTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;
		while (true) {			
			try {
				System.out.print("Enter any year: ");
				year = input.nextInt();
				if (year == 0) {
					System.out.print("No year was entered");	
					break;
				}
				while (year != 0) {
					if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
						System.out.print(year + " is a leap year\n\n");
					}
					else {
						System.out.print(year + " is not a leap year\n\n");
					} 
					System.out.print("Enter any year: ");
					year = input.nextInt();	
				}
				if (year == 0) {	
					break;
				}
			} 
			catch (InputMismatchException e) {
				System.out.println("Enter integers only\n");
				input.nextLine();
			}	
		}
	}
}

			
