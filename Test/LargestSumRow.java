public class LargestSumRow {
	public static int[] largestSumOf(int[][] row) {
		int maxRow = 0;
		int maxRowIndex = 0;
		for (int i = 0; i < row[0].length; i++) {
			maxRow += row[0][i];
		}
		
		for (int j = 1; j < row.length; j++) {
			int nextSum = 0;
			for (int k = 0; k < row[j].length; k++) {
				nextSum += row[j][k];
			}
			if (nextSum > maxRow) {
				maxRow = nextSum;
				maxRowIndex = j;
			}
		}
		return row[maxRowIndex];
	}
}