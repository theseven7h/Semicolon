public class TaskArrays {
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int rows = 0; rows < m.length; rows++) {
			sum += m[rows][columnIndex];
		}
		return sum;
	}
}