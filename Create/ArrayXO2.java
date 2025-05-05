public class ArrayXO2 {
	public static void main(String[] args) {
		char[][] xo = new char[3][3];

		xo[0][0] = 'X'; xo[0][1] = 'O'; xo[0][2] = 'X'; 
		xo[1][0] = 'O'; xo[1][1] = 'O'; xo[1][2] = 'O'; 
		xo[2][0] = 'X'; xo[2][1] = 'X'; xo[2][2] = 'O'; 

		for (int i = 0; i < xo.length; i++) {
			printArray(xo[i]);
		}
	}

	public static void printArray(char[] tomi) {
		for (int i = 0; i < tomi.length; i++) {
			System.out.print(tomi[i] + " ");
		}	
		System.out.println();
	}
}