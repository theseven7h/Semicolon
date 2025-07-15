package shapeHierarachy;

public class Square implements TwoDimensionalShape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    private double getSideLength() {
        return sideLength;
    }

    public double getArea() {
        return getSideLength() * getSideLength();
    }

    @Override
    public String toString() {
        return String.format("Side Length: %.2f%nArea: %.2f", getSideLength(), getArea());
    }
}
