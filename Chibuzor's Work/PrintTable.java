public class PrintTable {
	public static void main(String[] args) {
		int number = 0;
		int number2 = 1;
		System.out.printf("%-8s%-8s%-8s%n", "a", "b", "pow(a, b)");
		
		for(int row = 1; row <= 5; row++) {
			for(int num = 1; num >= 1; num--) {
				number++;
				number2++;
				int power = 1;
				for(int c = 1; c <= number2; c++) {
					power *= number;
				}
				System.out.printf("%-8d%-8d%-8d", number, number2, power);
			}
			System.out.println();
		}
	}
}
				