import java.util.Scanner;

public class Subtraction {
	static boolean check(int num1, int num2, int diff) {
		return num1 - num2 == diff;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int correct = 0;
		for(int count = 1; count <= 10; count++) {
			int num1 = (int)(Math.random() * 21);
			int num2 = (int)(Math.random() * 21);
			while (num1 < num2) {
				num1 = (int)(Math.random() * 21);
				num2 = (int)(Math.random() * 21);
			}
			
			for(int i = 1; i <= 2; i++) {
				System.out.printf("%d - %d = ", num1,num2);
				int diff = sc.nextInt();
				if (check(num1,num2,diff) == true) {
					System.out.println("Correct!\n");
					correct++;
					break;
				}
				System.out.println();
				if (i == 1) {
					System.out.print("One more try!\n");
					continue;
				} else System.out.print("Wrong!\n");
			}
		}
		
		System.out.printf("Total score = %d/10",correct);
			}
}