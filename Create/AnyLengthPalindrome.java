import java.util.Scanner;

public class AnyLengthPalindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter any length of integers: ");
		String userEntry = input.nextLine();

		int toNumber = Integer.valueOf(userEntry);
		int palindrome = toNumber;
		
		//System.out.print(toNumber);
		int rem = 0;
		int reversed = 0;
		//System.out.print(userEntry.length());
		for (int count = userEntry.length(); count >= 1; count--) {
			rem = toNumber % 10;
			reversed = (reversed * 10) + rem;
			toNumber /= 10; 
		}
		if (palindrome == reversed) System.out.println(palindrome + " is a palindrome");
		else if (palindrome != reversed) System.out.println(palindrome + " is not a palindrome");
	}
}