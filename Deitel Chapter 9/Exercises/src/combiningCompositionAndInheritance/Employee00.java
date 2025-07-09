package combiningCompositionAndInheritance;

public class Employee00 {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private CompensationModel compensationModel;

    public Employee00(String firstName, String lastName, String socialSecurityNumber, CompensationModel compensationModel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.compensationModel = compensationModel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public CompensationModel getCompensationModel() {
        return compensationModel;
    }

    public void setCompensationModel(CompensationModel compensationModel) {
        this.compensationModel = compensationModel;
    }

    private double earnings() {
        return compensationModel.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f", "Employee",
                getFirstName(), getLastName(), "social security number", getSocialSecurityNumber(), "Earnings", earnings());
    }
}
