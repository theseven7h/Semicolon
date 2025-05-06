public class ArraySession {
	static int noOfUniqueValuesIn(int[] numbers) {
		int[] values = new int[numbers.length];
		int count = 0;
		int uniqueCount = 0;
		for (int i = 0; i < numbers.length; i++) {
			count = 0;
			values[i] = numbers[i];

			for (int j: numbers) {
				if (j == values[i]) count++;
			}
			if (count == 1) uniqueCount++;
		
		}
		return uniqueCount;
	}

	static int[] uniqueValuesIn(int[] numbers) {
		int[] uniqueValues = new int[noOfUniqueValuesIn(numbers)];
		int[] values = new int[numbers.length];
		int count = 0;
		int uniqueCount = 0;
		for (int i = 0; i < numbers.length; i++) {
			values[i] = numbers[i];
			count = 0;
			for (int j: numbers) {
				if (j == values[i]) count++;
			}
			if (count == 1) uniqueValues[uniqueCount++] = values[i];
		}
		return uniqueValues;
	}
}