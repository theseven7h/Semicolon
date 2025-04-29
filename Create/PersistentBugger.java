import java.util.Scanner;

public class PersistentBugger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int number = input.nextInt();

		String num1 = Integer.toString(number);
		int length = num1.length();
		int rem = 0;
		int multiply = 1;
		int multi = 1;
		for (;length >= 1; length--) {
			




			/*rem = number % 10;
			multiply *= rem;
			number /= 10;
			for(;length = 1;) {
				int check = multiply % 10;
				multi *= check;
				multiply /= 10;
				if (check > 9)*/
			}
		}
				
		System.out.print(length);
	}
}