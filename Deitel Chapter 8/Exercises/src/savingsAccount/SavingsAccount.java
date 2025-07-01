package savingsAccount;

public class SavingsAccount {
    private static double annualInterestRate;

    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        if (savingsBalance < 0) throw new IllegalArgumentException("Savings balance cannot be negative");
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterestRate() {
        int MONTHS_PER_YEAR = 12;
        savingsBalance += (savingsBalance * (annualInterestRate / 100)) / MONTHS_PER_YEAR;
    }

    public  double getSavingsBalance() {
        return savingsBalance;
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }
}
