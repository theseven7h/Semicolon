public class BasePlusCommissionEmployee {
    private final CommissionEmployee employee;
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        this.employee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public String getFirstName() {
        return employee.getFirstName();
    }

    public String getLastName() {
        return employee.getLastName();
    }

    public String getSocialSecurityNumber() {
        return employee.getSocialSecurityNumber();
    }

    public double getGrossSales() {
        return employee.getGrossSales();
    }

    public double getCommissionRate() {
        return employee.getCommissionRate();
    }

    public void setBaseSalary(double baseSalary) {
        if  (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        return getBaseSalary() * employee.earnings();
    }

    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried", employee, "base salary: ", getBaseSalary());
    }
}