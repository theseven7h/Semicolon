package savingsAccount;


public class SavingsAccountRun {
    public static void main(String[] args) {
        SavingsAccount acct1 = new SavingsAccount(2000);
        SavingsAccount acct2 = new SavingsAccount(3000);

        System.out.printf("Savings Balance(Initial):%n\tAccount 1 balance:$%.2f%n\tAccount 2 balance:$%.2f%n%n", acct1.getSavingsBalance(), acct2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(4);
        for(int month = 1; month <= 12; month++) {
            acct1.calculateMonthlyInterestRate();
            acct2.calculateMonthlyInterestRate();
        }
        System.out.printf("Savings Balance(4%% interest rate):%n\tAccount 1 balance:$%.2f%n\tAccount 2 balance:$%.2f%n%n", acct1.getSavingsBalance(), acct2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(5);

        acct1.calculateMonthlyInterestRate();
        acct2.calculateMonthlyInterestRate();

        System.out.printf("Savings Balance(5%% interest rate):%n\tAccount 1 balance:$%.2f%n\tAccount 2 balance:$%.2f%n", acct1.getSavingsBalance(), acct2.getSavingsBalance());
    }



}