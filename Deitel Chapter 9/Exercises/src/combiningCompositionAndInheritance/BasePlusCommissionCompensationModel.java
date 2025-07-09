package combiningCompositionAndInheritance;

public class BasePlusCommissionCompensationModel extends CompensationModel {
    private double grossSales;
    private double commissionRate;
    private double baseSalary;

    public BasePlusCommissionCompensationModel(double grossSales,  double commissionRate,  double baseSalary) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return baseSalary + (grossSales * commissionRate);
    }
}
