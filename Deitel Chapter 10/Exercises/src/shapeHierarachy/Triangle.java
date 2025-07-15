package shapeHierarachy;

public class Triangle implements TwoDimensionalShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (getBase() * getHeight()) / 2;
    }

    @Override
    public String toString() {
        return String.format("Base: %.2f%nHeight: %.2f%nArea: %.2f", getBase(), getHeight(), getArea());
    }
}
