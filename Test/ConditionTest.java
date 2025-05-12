import java.util.Scanner;
import java.util.Arrays;

public class ConditionTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//int[][] numbers = {{2,4,6},{3,11,15},{1,4,5}};
		
		System.out.print("How many rows are you entering: ");
		int amount = input.nextInt();

		int[][] numbers = new int[amount][];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("Desired amount of numbers in row %d: ", i);
			int innerRow = input.nextInt(); 
			numbers[i] = new int[innerRow]; 
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print("Enter number: ");
				numbers[i][j] = input.nextInt();
			}
		}
		System.out.print(Arrays.toString(LargestSumRow.largestSumOf(numbers)));
		//System.out.print(LargestSumRow.largestSumOf(numbers));
	}
}
		

			
