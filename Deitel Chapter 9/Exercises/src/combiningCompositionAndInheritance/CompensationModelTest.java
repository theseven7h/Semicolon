package combiningCompositionAndInheritance;

public class CompensationModelTest {
    public static void main(String[] args) {
        Employee00 employee1
                = new Employee00("James", "Tauri", "213892211121", new CommissionCompensationModel(10000, 0.06));
        Employee00 employee2
                = new Employee00("Tphils", "Umar", "478229921121", new BasePlusCommissionCompensationModel(5000, .04, 300));

        System.out.printf("%s%n%n", employee1);
        System.out.printf("%s%n%n", employee2);

        employee1.setCompensationModel(new BasePlusCommissionCompensationModel(5000, .04, 300));
        employee2.setCompensationModel(new CommissionCompensationModel(10000, 0.06));

        System.out.printf("%s%n%n", employee1);
        System.out.printf("%s%n%n", employee2);
    }
}
