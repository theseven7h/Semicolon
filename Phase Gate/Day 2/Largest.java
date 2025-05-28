public class Largest {
	public static int[] locateLargestOf(double[][] numbers) {
		int[] idx = new int[2];
		double largest = -200000000.0;
		for(int row = 0; row < numbers.length; row++) {
			for(int col = 0; col < numbers[row].length; col++) {
				if (numbers[row][col] > largest) {
					largest = numbers[row][col];
					idx[0] = row;
					idx[1] = col;
				}
			}
		}
		
		return idx;
	}
}