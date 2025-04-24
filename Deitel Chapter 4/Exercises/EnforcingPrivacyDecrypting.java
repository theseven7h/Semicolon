import java.util.Scanner;

public class EnforcingPrivacyDecrypting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the encrypted integer: ");
		int number = input.nextInt();
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
		int collect = 0;

		for(int count = 1; count <= 3; count++) {
			collect = number % 10;
			if (number > 999) num4 = collect;
			else if (number > 99) num3 = collect;
			else if (number > 9) { 
				num2 = collect;
				number /= 10;
				num1 = number;
			}
			number /= 10;
			for(;count == 3; count++) {
				num1 = num1  ;
				num2 = (num2 + 7) % 10;
				num3 = (num3 + 7) % 10;
				num4 = (num4 + 7) % 10;
