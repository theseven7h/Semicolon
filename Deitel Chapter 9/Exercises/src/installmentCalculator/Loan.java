package installmentCalculator;

public class Loan {
    private double principalAmount;
    private int tenure;

    public Loan(double principalAmount, int tenure) {
        this.principalAmount = principalAmount;
        this.tenure = tenure;
    }

    public double getPrincipalAmount() {
        return principalAmount;
    }

    public int getTenure() {
        return tenure;
    }
}
