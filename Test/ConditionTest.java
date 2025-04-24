import java.util.Scanner;

public class ConditionTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 5 or 6: ");
		int number = input.nextInt();

		while (number < 5 || number > 6) {
			System.out.print("Invalid input");
			System.out.print("Enter 5 or 6: ");
			number = input.nextInt();
		}
	}
}
		

			
