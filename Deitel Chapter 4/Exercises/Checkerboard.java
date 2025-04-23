public class Checkerboard {
	public static void main(String[] args) {
		for (int row = 8; row >= 1; row--) {
			if (row % 2 != 0) {
				int spc = 1;
				for (;spc <= 1; spc++) {
					System.out.print(" ");
				}
			}
			for (int star = 8; star >= 1; star--) {
				System.out.print("* ");
			}
		        System.out.println();
		}
	}
}
			
		