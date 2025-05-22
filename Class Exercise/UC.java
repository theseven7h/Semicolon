public class UC {
	public static int secondLargestOf(int[] numbers) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for (int count = 0; count < numbers.length; count++) {
			if (numbers[count] > largest) {
				secondLargest = largest;
				largest = numbers[count];
			}
			else if (numbers[count] > secondLargest) {
				secondLargest = numbers[count];
			}
		}
		return secondLargest;
	}
	
	public static void main(String[] args) {
		int[] numbers = {9, 6, 8, 11, 12};
		System.out.print("Second largest number is " + secondLargestOf(numbers));
	}
}