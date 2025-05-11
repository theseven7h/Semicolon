import java.util.Scanner;
import java.util.Arrays;

public class AdditiveInverseOfCollections {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many numbers are you entering: ");
		int amountOfNumbers = input.nextInt();
		int[] numbers = new int[amountOfNumbers];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter number: ");
			numbers[i] = input.nextInt();
		}
		
		System.out.print(Arrays.toString(MyMath.findAdditiveInverse(numbers)));
	}
}