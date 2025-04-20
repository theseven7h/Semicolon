public class Stars {
	public static void main(String[] args) {
		for(int row = 1; row <= 10; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for(int row = 1; row <= 10; row++) {
			for(int col = 10; col >= row; col--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for(int row = 1; row <= 10; row++) {
			for(int spc = 1; spc <= row; spc++) {
				System.out.print(" ");
			}
			for(int col = 10; col>= row; col--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
			
		for(int row = 1; row <= 10; row++) {
			for(int spc = 10; spc >= row; spc--) {
				System.out.print(" ");
			}
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}
			