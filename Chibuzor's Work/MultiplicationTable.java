public class MultiplicationTable {
	static void displayMultiplicationTable(int a, int b) {
		System.out.print("    ");
		for (int header = a; header <= b; header++) {
			System.out.printf("%5s%d%s", "|", header, "|");
		}
		System.out.println();
		for(int row = a; row <= b; row++) {
			System.out.printf("%d |", row);
			for(int count = a; count <= b; count++) {
				System.out.printf("%7d", row * count);
			}
			System.out.println();
		}	
	}
}