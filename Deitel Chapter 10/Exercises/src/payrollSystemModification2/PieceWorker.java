package payrollSystemModification2;

import payrollSystemModification.Date;
import payrollSystemModification.Employee;

public class PieceWorker extends Employee {
    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName,
                       String socialSecurityNumber, Date birthDate, double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        this.wage = wage;
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public int getPieces() {
        return pieces;
    }

    @Override
    public double earnings() {
        return getWage() * getPieces();
    }

    @Override
    public String toString() {
        return String.format("piece worker employee: %s%nwage: $%,.2f; pieces produced: %d",
                super.toString(), getWage(), getPieces());
    }
}
