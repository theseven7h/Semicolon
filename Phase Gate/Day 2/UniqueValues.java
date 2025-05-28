public class UniqueValues {
	static int sumUniqueIn(int[] numbers) {
		int count = 0;
		int[] values = new int[numbers.length];
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			count = 0;
			values[i] = numbers[i];

			for (int j: numbers) {
				if (j == values[i]) count++;
			}
			if (count == 1) sum += values[i];
		}
		return sum;
	}
}