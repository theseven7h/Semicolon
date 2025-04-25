import java.util.Scanner;

public class StringLengthTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		String fullName = " Gloria Glynnis Bitrus ";
		String gender = "is a female";
		int length = fullName.length();
		System.out.println(fullName.length());

		String details = fullName.concat(gender);
		System.out.println(details);

		System.out.print(gender.charAt(1));

		System.out.println("Enter a line: ");
 		String s = input.nextLine();
		System.out.println("The line entered is " + s);


		System.out.print("Enter a number: ");
		String numb = input.nextLine();
		for (int counter = 0 ;counter < 4;) {
			try {
				int mainNumb = Integer.parseInt(numb);
				System.out.print("Number entered is " + mainNumb);
				counter++;
			} catch (NumberFormatException qq) {
				System.out.print("Invalid input.");
			}
		}
	}
}