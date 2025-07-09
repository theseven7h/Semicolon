package employeeHierarchy;

public class CommissionEmployeeTest0 {
    public static void main(String[] args) {
        CommissionEmployee0 employee = new CommissionEmployee0(
                "Sue", "Jones", "222-22-2222", 10000, 0.06);

        System.out.println("Employee information obtained by get methods:");
        System.out.printf("First name is: %s%n", employee.getFirstName());
        System.out.printf("Last name is: %s%n", employee.getLastName());
        System.out.printf("Social security number is: %s%n",
                employee.getSocialSecurityNumber());
        System.out.printf("Gross sales is: %.2f%n", employee.getGrossSales());
        System.out.printf("Commission rate is: %.2f%n",
                employee.getCommissionRate());

        employee.setGrossSales(5000);
        employee.setCommissionRate(0.1);

        System.out.printf("%nUpdated employee information obtained by toString:%n%n%s%n",
                employee.toString());
    }
}
