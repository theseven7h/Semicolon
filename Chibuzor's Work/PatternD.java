public class PatternD {
	public static void main(String[] args) {
		for(int row = 6; row >= 1; row--) {
			for(int spc = 6; spc >= row; spc--) {
				System.out.print("  ");
			}
			for(int num = 1; num <= row; num++) {
				System.out.print(" " + num);
			}
			System.out.println();
		}
	}
}
			