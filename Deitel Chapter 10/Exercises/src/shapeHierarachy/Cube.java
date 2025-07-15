package shapeHierarachy;

public class Cube implements ThreeDimensionalShape{
    private double edgeLength;

    public Cube(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    @Override
    public double getArea() {
        return 6 * (getEdgeLength() * getEdgeLength());
    }

    @Override
    public double getVolume() {
        return getEdgeLength() * getEdgeLength() * getEdgeLength();
    }

    @Override
    public String toString() {
        return String.format("Radius: %.2f%nArea: %.2f%nVolume: %.2f", getEdgeLength(), getArea(), getVolume());
    }
}
