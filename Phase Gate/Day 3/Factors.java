public class Factors {
	static int amountOfFactorsOf(int number) {
		int check = 0;
		for(int count = 1; count <= number; count++) {
			if (number % count == 0) {
				check++;
			}
		}
		return check;
	}
	
	static int[] factorsOf(int number) {
		int[] factors = new int[amountOfFactorsOf(number)];
		int factorCount = 0;
		for(int count = 1; count <= number; count++) {
			if (number % count == 0) {
				factors[factorCount] = count;
				factorCount++;
			}
		}
		return factors;
	}

}