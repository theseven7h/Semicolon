package installmentCalculator;

import java.util.Scanner;

public class InstallmentCalculatorTest {
    public static void main(String[] args) {
        print("""
                Welcome to the Installment Calculator!
                What would you like to calculate today?
                """);
        menu();
    }

    private static void menu() {
        Scanner input = new Scanner(System.in);

        print("""
                1. Home Loan
                2. Vehicle Loan
                3. Personal Loan
                4. Exit
                """);
        String menuChoice = input.next();

        switch (menuChoice) {
            case "1" -> {
                print("Enter the principal amount: ");
                double principalAmount = input.nextDouble();
                print("Enter the tenure(years): ");
                int tenure = input.nextInt();

                HomeLoan homeLoan = new HomeLoan(principalAmount, tenure);
                homeLoan.calculateMonthlyInstallment();
                System.out.printf("%n%s", homeLoan);
                menu();
            }

            case "2" -> {
                print("Enter the principal amount: ");
                double principalAmount = input.nextDouble();
                print("Enter the tenure(years): ");
                int tenure = input.nextInt();

                VehicleLoan vehicleLoan = new VehicleLoan(principalAmount, tenure);
                vehicleLoan.calculateMonthlyInstallment();
                System.out.printf("%n%s", vehicleLoan);
                menu();
            }

            case "3" -> {
                print("Enter the principal amount: ");
                double principalAmount = input.nextDouble();
                print("Enter the tenure(years): ");
                int tenure = input.nextInt();

                PersonalLoan personalLoan = new PersonalLoan(principalAmount, tenure);
                personalLoan.calculateMonthlyInstallment();
                System.out.printf("%n%s", personalLoan);
                menu();
            }

            case "4" -> {
                print("Thank you for using this Installment Calculator!");
                System.exit(0);
            }

            default -> {
                print("Please enter a valid option!");
                menu();
            }
        }
    }

    public static void print(String message) {
        System.out.println(message);
    }
}