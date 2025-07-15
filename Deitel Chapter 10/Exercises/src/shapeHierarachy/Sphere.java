package shapeHierarachy;

public class Sphere implements ThreeDimensionalShape{
    private double radius;
    private static final double PI = Math.PI;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return (4 * PI) * (getRadius() * getRadius());
    }

    @Override
    public double getVolume() {
        return (4 * PI) * (getRadius() * getRadius() * getRadius()) / 3;
    }

    @Override
    public String toString() {
        return String.format("Radius: %.2f%nArea: %.2f%nVolume: %.2f", getRadius(), getArea(), getVolume());
    }
}