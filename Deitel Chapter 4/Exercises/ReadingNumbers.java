import java.util.Scanner;

public class ReadingNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		System.out.println("Now enter the integers: ");
		int sum = 0;
		for(;sum < number;) {
			int integers = input.nextInt();
			sum += integers;
		}
		if (sum == number) System.out.print("The numbers are now equal to " + number);
		else if (sum > number) System.out.print("\nThe numbers are now greater than " + number);
		System.out.print(", the sum being " + sum);
	}
}
			
			