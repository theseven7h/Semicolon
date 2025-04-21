import java.util.Scanner;

public class TwoLargestNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int largest = -2000000;
		int largest2 = -2000000;
		int num3 = 0;
		int count = 1;
		
		do {
			System.out.print("Enter number: ");
			int number = input.nextInt();
			if (number > largest) {
				largest2 = largest; largest = number; 
			}
			else if (number > largest2) largest2 = number; 
			count++;
		} while (count <= 10);
		System.out.printf("The two largest numbers are: %d and %d", largest, largest2);
	}
}
			
			
			