public class Duplicate {
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
			if (count > 1) uniqueCount++;
		}
		return uniqueCount/2;
	}
	
	static int[] omitDuplicateIn(int[] numbers) {
		int length = numbers.length - noOfUniqueValuesIn(numbers);
		int[] values = new int[length];
		int count = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			
			for(int j : numbers) {
				if(j == numbers[i]) {
					count = 0;
					for(int k: values) {
						if (k == j) count++;
					}
					if (count == 1) values[i] = j;
				}
			}
		}
		return values;
	}
}
