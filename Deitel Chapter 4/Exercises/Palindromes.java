import java.util.Scanner;

public class Palindromes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a 5-digits palindrome: ");
		int pal = input.nextInt();
		for(;pal < 10000 || pal > 99999;) {
			System.out.print("Error, Enter a 5-digits palindrome: ");
			pal = input.nextInt();
		}
		int number = pal;		
		int rem = 1;
		int num; int num1 = 0; int num2 = 0; int num3 = 0; int num4 = 0; int num5 = 0;
		int check = 0;

		for(int start = 1; start <= 5; start++) {
			rem = 10;
			for(int count = 1; count <= 1; count++) {
				num = pal % rem;
				if (pal > 9999) num5 = num;
				else if (rem > 999) num4 = num;
				else if (rem > 99) num3 = num;
				else if (rem > 9) num2 = num;
				else num1 = num;

				pal /= rem;
				System.out.println(num);
				//System.out.printf("%n%d", pal);
			}
		}
		System.out.printf("%n%d", num1);
		/*if (num1 == num5) check++;
		if (num2 == num4) check++;
		if (check == 2) System.out.printf("%n%d is a palindrome", number);
		else System.out.printf("%n%d is not a palindrome", number);
		System.out.printf("%n%d", number);*/
	}
}
		
			
			
			
	