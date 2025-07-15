package shapeHierarachy;

public class Tetrahedron implements ThreeDimensionalShape{
    private double edgeLength;

    public Tetrahedron(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * (getEdgeLength() * getEdgeLength());
    }

    @Override
    public double getVolume() {
        return (getEdgeLength() * getEdgeLength() * getEdgeLength()) / (6 * Math.sqrt(2));
    }

    @Override
    public String toString() {
        return String.format("Radius: %.2f%nArea: %.2f%nVolume: %.2f", getEdgeLength(), getArea(), getVolume());
    }
}
