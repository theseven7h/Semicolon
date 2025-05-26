import java.util.Arrays;
public class FM {
	public static int[] maxAndMinSumsIn(int[] numbers) {
		int[] sum = new int[numbers.length];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int count = 0; count < numbers.length; count++) {
			for (int count2 = 0; count2 < numbers.length; count2++) {
				if (numbers[count2] != numbers[count]) {
					sum[count] += numbers[count2];
				}
			}
			if (sum[count] > max) {
				max = sum[count];
			}
			if (sum[count] < min) {
				min = sum[count];
			}			
		}
		int [] result = {min, max};
		return result;	
	}
	
	public static int productOf(int numberOne, int numberTwo) {
		int product = 0;
		for (int count = 0; count < numberTwo; count++) {
			product += numberOne;
		}
		return product;
	}
	
	public static int[] sort(int[] numbers) {
		int presentSmallest = Integer.MAX_VALUE;
		int presentIndex = 0;
		
		for (int count = 0; count < numbers.length; count++) {
			presentSmallest = Integer.MAX_VALUE;
			for (int count2 = count; count2 < numbers.length; count2++) {
				if (numbers[count2] <= presentSmallest) {
					presentSmallest = numbers[count2];
					presentIndex = count2;
				}	
			}
			numbers[presentIndex] = numbers[count];
			numbers[count] = presentSmallest;
		}
		return numbers;
	}
	
	public static int[] squareNumbersIn(int[] numbers) {
		int[] squares = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			squares[i] = numbers[i] * numbers[i];
		}
		return squares;
	}
	
	public static int[] sortSquaresOf(int[] numbers) {
		return sort(squareNumbersIn(numbers));
	}
	
	public static void main(String[] args) {
		int[] numbers = {9,2,7,0,5};
		System.out.print(Arrays.toString(sortSquaresOf(numbers)));
	}
}