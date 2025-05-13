public class AmericanFlag {
	public static void main(String[] args) {
		for (int rows = 1; rows <= 9; rows++) {
			for (int stars = 1; stars <= 9; stars++) {
				if (rows % 2 == 0) System.out.print(" *"); 
				else System.out.print("* ");
			}
			
			for (int dash = 1; dash <= 45; dash++) {
				System.out.print("=");
			}
			System.out.println();
		}
		for (int rows = 1; rows <= 8; rows++) {
			for (int dash = 1; dash <= 63; dash++) {
				System.out.print("=");
			}
			System.out.println();
		}
	}
}