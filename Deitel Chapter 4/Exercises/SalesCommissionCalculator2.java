import java.util.Scanner;

public class SalesCommissionCalculator2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the item type (1, 2, 3, 4) or 0 to quit: ");
		int item = input.nextInt();
		int total = 0;
		double price = 0;
		int amount = 0;
		int earnings = 200;

		for (;item != 0;) {
			if (item == 1) {
				System.out.print("Enter the amount sold: ");
				amount = input.nextInt();
				price = amount * 239.99;
				total += price;
			}
			if (item == 2) {
				System.out.print("Enter the amount sold: ");
				amount = input.nextInt();
				price = amount * 129.75;
				total += price;
			}
			if (item == 3) {
				System.out.print("Enter the amount sold: ");
				amount = input.nextInt();
				price = amount * 99.95;
				total += price;
			}
			if (item == 4) {
				System.out.print("Enter the amount sold: ");
				amount = input.nextInt();
				price = amount * 350.89;
				total += price;
			}
			System.out.print("Enter the item type (1, 2, 3, 4) or 0 to quit: ");
			item = input.nextInt();

		}
		
		double totalEarnings = (total * 0.09) + 200;
		System.out.printf("%nThe total earning is: $%,.2f", totalEarnings);
	}
}
		
