package installmentCalculator;

public class PersonalLoan extends Loan {
    private final double ANNUAL_INTEREST_RATE = 12.5;
    private double monthlyInstallment;

    public PersonalLoan (double principalAmount, int tenure) {
        super(principalAmount, tenure);
    }

    public double getAnnualInterestRate() {
        return ANNUAL_INTEREST_RATE;
    }

    public void calculateMonthlyInstallment() {
        double monthlyInterestRate = getAnnualInterestRate() / 12 / 100;
        double tenureInMonths = getTenure() * 12;
        double compoundFactor = Math.pow(1 + monthlyInterestRate, tenureInMonths);
        monthlyInstallment =  (getPrincipalAmount() * monthlyInterestRate * compoundFactor) / (compoundFactor - 1);
    }

    public double getMonthlyInstallment() {
        return monthlyInstallment;
    }

    @Override
    public String toString() {
        return String.format("%s%n\t%s: $%,.2f%n\t%s: %d years%n\t%s: %%%.2f%n\t%s: $%,.2f%n%n", "PERSONAL LOAN", "Principal Amount", getPrincipalAmount(), "Tenure", getTenure(), "Interest Rate", ANNUAL_INTEREST_RATE, "Monthly Installment", getMonthlyInstallment());
    }
}
