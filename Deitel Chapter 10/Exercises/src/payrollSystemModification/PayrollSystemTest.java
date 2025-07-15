package payrollSystemModification;

public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith", "111-11-1111", new Date(12,18, 1993) ,800.00);
        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen", "Price", "222-22-2222", new Date(1,1, 1994), 16.75, 40);
        CommissionEmployee commissionEmployee =
                new CommissionEmployee("Sue", "Jones", "333-33-3333", new Date(7,7, 1999), 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", new Date(8,25, 2000), 5000, .04, 300);

        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println("Employees processed polymorphically:\n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%,.2f%n",
                        employee.getBaseSalary());
            }

            double earnings = currentEmployee.earnings();
            if(isCurrentMonth(7, currentEmployee.getBirthDate().getMonth())) {
                earnings += 100;
                System.out.println("Birthday bonus applied");
            }
            System.out.printf("earned $%,.2f%n%n", earnings);
            System.out.println();
        }

        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s%n", j,
                    employees[j].getClass().getSimpleName());
        }
    }

    public static boolean isCurrentMonth(int currentMonth, int birthMonth) {
        return currentMonth == birthMonth;
    }
}

