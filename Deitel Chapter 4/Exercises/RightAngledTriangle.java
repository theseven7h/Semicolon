import java.util.Scanner; 

public class RightAngledTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the base of the right-angled triangle (between 1 & 10): ");
		int base = input.nextInt();
		
		if (base > 10 || base < 1) {
			for (;base > 10 || base < 1;) {
				System.out.print("Wrong input. Enter the base of the right-angled triangle (between 1 & 10): ");
				base = input.nextInt();
			}
		}
		for (int row = 1; row <= base; row++) {
			for (int col = 1; col <= row; col++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
		
		