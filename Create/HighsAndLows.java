import java.util.Scanner;

public class HighsAndLows {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println();

		System.out.print("Enter any number: ");
		String number = input.nextLine();
		String newNumber = number.replace(" ","");
		int mainNumb = Integer.valueOf(newNumber);		

		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		int rem = 0;

		for (int y = newNumber.length(); y >= 1; y--) {
			rem = mainNumb % 10;
			for (int z = newNumber.length(); z >= 1; z--) {
				if (rem > largest) largest = rem;
				if (rem < smallest) smallest = rem;
			}
			mainNumb /= 10;
		}
		System.out.println("\nThe largest number is " + largest);
		System.out.print("The smallest number is " + smallest);
		System.out.println();	
	}
}