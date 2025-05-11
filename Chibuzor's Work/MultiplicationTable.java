public class MultiplicationTable {
	static void displayMultiplicationTable(int a, int b) {
		for(int row = a; row <= b; row++) {
			for(int count = a; count <= b; count++) {
				System.out.printf("%7d", row * count);
			}
			System.out.println();
		}	
	}
}