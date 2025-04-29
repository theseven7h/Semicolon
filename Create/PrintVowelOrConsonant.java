import java.util.Scanner;

public class PrintVowelOrConsonant {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Input an alphabet: ");
		String userInput = input.next();

		if (userInput.length() > 1 || !userInput.matches("[a-zA-Z]")) {
			System.out.println("Error, enter one alphabet"); 
		}

		if (userInput.matches("[a-zA-Z]") && userInput.matches("[aeiouAEIOU]")) {
			System.out.println(userInput + " is a vowel");
		}

		else if (userInput.matches("[a-zA-Z]") && !userInput.matches("[aeiouAEIOU]")) {
			System.out.println(userInput + " is a consonant");
		}
	}
}
