public class PyramidPattern {
	public static void main(String[] args) {
		
		for (int row = 1; row <= 8; row++) {
			int num = 1;
			for (int spc = 8; spc >= row; spc--) {
				System.out.print("*");
			}
			for (int col = 1; col <= row; col++) {
				num = (int)Math.pow(num, 3);
				System.out.print(num);
			}
			System.out.println();
		}
	}
}