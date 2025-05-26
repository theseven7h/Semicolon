public class StudentsScoreboard {
	static int[] getTotalOf(int[][] scores) {
		int[] total = new int[scores.length];
		for (int count = 0; count < scores.length; count++) {
			for (int count2 = 0; count2 < scores[count].length; count2++) {
				total[count] += scores[count][count2];
			}
		}
		return total;
	}
	
	static double[] getAverageOf(int[] total, int length) {
		double[] average = new double[total.length];
		for (int count = 0; count < total.length; count++) {
			average[count] = (double)total[count] / length; 
			//average[count] = Math.round(average[count]);
		}
		return average;
	}
	
	static int[] getPositionOf(double[] average) {
		double largest = -20000000000000.0;
		int[] position = new int[average.length];
		int presentLargest = 0;
		for (int count = 0; count < position.length; count++) {
			for (int count2 = count; count2 < position.length; count2++) {
				if (average[count2] >= largest) {
					largest = average[count2];
					presentLargest = count2 + 1;
				}
			}
			position[count] = presentLargest;
		}
		return position;
	}
}