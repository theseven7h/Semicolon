public class TestStar {
	public static void main(String[] args) {
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= row ; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int row2 = 1; row2 <= 4; row2++) {
			for (int col2 = row2; col2 <= 3; col2++) {
				System.out.print("* ");
			}
			System.out.println();
		}		


	}
}