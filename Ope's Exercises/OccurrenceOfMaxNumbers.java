import java.util.Scanner;

public class OccurrenceOfMaxNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter numbers: ");
		int numbers = input.nextInt();
		int count = 1;
		int max = -2000000;
		
		while (numbers != -1) {
			if (numbers > max) {
				max = numbers; 
		 		count = 1;
			}
			else if (numbers == max) count++;
			numbers = input.nextInt();
			
		}

		System.out.println("The largest number is " + max);
		System.out.print("The occurrence count of the largest number is " + count);
	}
}
		