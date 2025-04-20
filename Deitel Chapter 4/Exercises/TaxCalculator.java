import java.util.Scanner;

public class TaxCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int count = 1;
		double tax = 0;	
		double annualEarning = 0;
		
		for(;count < 4;) {
			System.out.println("\nCitizen " + count);
			System.out.print("Enter the annual earning: ");
			annualEarning = input.nextDouble();

			if (annualEarning <= 30000) {tax = annualEarning * 0.15;}
			else if (annualEarning > 30000) {tax = annualEarning * 0.20;}
			System.out.printf("The total tax is $%,.2f", tax);
			count++;
		}
		if (annualEarning == 0) System.out.print("\nNo input was entered");
	}
}
			
				
			