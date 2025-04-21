public class TabularOutput {
	public static void main(String[] args) {
		System.out.printf("%-10s%-10s%-10s%-10s", "N", "N^2", "N^3", "N^4");
		System.out.println();
		System.out.println();
		int number = 0;
		for(int row = 1; row <= 5; row++) {
			number++;
			long square = 0, cube = 0, tesseract = 0;
			for(int a = 1; a <= 1; a++) {
				
				square = number * number;
				cube = square * number;
				tesseract = cube * number;
				System.out.printf("%-10d%-10d%-10d%-10d", number, square, cube, tesseract);
			}
			System.out.println();
		}
	}
}
				
			