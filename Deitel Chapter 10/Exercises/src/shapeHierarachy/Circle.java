package shapeHierarachy;

public class Circle implements TwoDimensionalShape{
    private double radius;
    private static final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return PI * getRadius() * getRadius();
    }

    @Override
    public String toString() {
        return String.format("Radius: %.2f%nArea: %.2f", getRadius(), getArea());
    }
}
