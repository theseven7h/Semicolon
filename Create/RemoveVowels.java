import java.util.Scanner;

public class RemoveVowels {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your word(s): ");
		String words = input.nextLine();

		while(!words.equalsIgnoreCase("Exit")) {
	
		String newWords = words.replaceAll("([aeiouAEIOU])", "");
		System.out.println(newWords);

		System.out.print("Enter your word(s): ");
		words = input.nextLine();
		}
		/*String modify = words.replace("a", "");
		String modify2 = modify.replace("e", "");
		String modify3 = modify2.replace("i", "");		
		String modify4 = modify3.replace("o", "");
		String modify5 = modify4.replace("u", "");

		System.out.print(modify5);*/
	}
}