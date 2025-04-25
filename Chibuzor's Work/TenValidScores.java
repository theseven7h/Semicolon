import java.util.Scanner;

public class TenValidScores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int validCount = 0;
		int invalidCount = 0;
		int a = 0, b = 0, c = 0, d = 0, f = 0;

		while(validCount < 10) {
			System.out.print("Enter score: ");
			int score = input.nextInt();

			if (score >= 0 && score <= 100) {
				switch (score/10) {
					case 10, 9, 8: System.out.println("A"); a++; break;
					case 7: System.out.println("B"); b++; break;
					case 6: System.out.println("C"); c++; break;
					case 5: System.out.println("D"); d++; break;
					default: System.out.println("F"); f++; break;
				}
				validCount++;
			} 
			else if (score < 0 || score > 100) {
				System.out.print("Invalid input\n");
				invalidCount++;
			}
		}
		System.out.printf("%nFinal Results: %nA: %d%nB: %d%nC: %d%nD: %d%nF: %d%n%n", a, b, c, d, f);
		System.out.printf("Valid Inputs: %d%nInvalid Inputs: %d%n", validCount, invalidCount);
	}
}