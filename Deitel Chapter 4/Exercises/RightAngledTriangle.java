import java.util.Scanner; 

public class RightAngledTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the base of the right-angled triangle: ");
		int base = input.nextInt();

		for (int row = 1; row <= base; row++) {
			for (int col = 1; col <= row; col++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
		
		