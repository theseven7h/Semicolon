public class TaskArrays {
	public static double sumColumn(double[][] m, int columnIndex) {
		double sumColumn = 0;
		for (int rows = 0; rows < m.length; rows++) {
			sumColumn += m[rows][columnIndex];
		}
		return sumColumn;
	}
	
	public static double sumMajorDiagonal(double[][] m) {
		double sumDiagonal = 0;
		int columnIndex = 0;
		for (int rows = 0; rows < m.length; rows++) {
			sumDiagonal += m[rows][columnIndex];
			 columnIndex++;
		}
		return sumDiagonal;
	}
}