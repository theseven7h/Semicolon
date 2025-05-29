public class SmallestIndexOfLargest {
	public static int indexOf(int[] numbers) {
		int largest = numbers[0];
		int index = 0;
		
		for(int count = 1; count < numbers.length; count++) {
			if(numbers[count] > largest) {
				largest = numbers[count];
			}
		}
		
		for(int count = 0; count < numbers.length; count++) {
			if(largest == numbers[count]) {
				index = count;
				break;
			}
		}
		return index;
	}
}