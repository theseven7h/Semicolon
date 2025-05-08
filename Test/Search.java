public class Search {
	public static void main(String[] args) {
		int[] numbers = {2,4,7,10,11,45,50,59,60,66,69,70,79};
		int key = 12;
		System.out.print(binarySearch(numbers, key));
		//insertion point - the return - 1
	}
			
	public static int binarySearch(int[] numbers, int key) {
		int low = 0;
		int high = numbers.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < numbers[mid]) high = mid - 1;
			else if (key == numbers[mid]) return mid;
			else low = mid + 1;
		}
	
		return -low - 1;
	}

	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
			return i;
		}
		return -1;
	}
}