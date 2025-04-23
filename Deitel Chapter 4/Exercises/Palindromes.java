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

		for(int start = 1; start <= 5; start++) {
			rem = 10;
			for(int count = 1; count <= 4; count++) {
				num = pal % rem;
				if (pal > 9999) num5 = num;
				else if (pal > 999) num4 = num;
				else if (pal > 99) num3 = num;
				else if (pal > 9) {num2 = num;
				pal /= rem; num1 = pal;}
				
				pal /= rem;				
			}

		}
		if (num1 == num5 && num2 == num4) {
			System.out.printf("%n%d is a palindrome", number);
		}
		else System.out.printf("%n%d is not a palindrome", number);			
	}
}
		
			
			
			
	