public class MyMath {
	static int findAdditiveInverse(int number) {
		number = -number
		return number;
	}
	
	static double findAdditiveInverse(double number) {
		number = -number
		return number;
	}
	
	static int[] findAdditiveInverse(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = findAdditiveInverse(numbers[i])
		}
		return numbers;
	}
}