package cylinder;

public class Cylinder {
    private double radius;
    private double height;

    public void setRadius(double radius) {
        if(radius < 0)
            throw new  IllegalArgumentException("Radius cannot be negative");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        if(height < 0)
            throw new  IllegalArgumentException("Height cannot be negative");
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return Math.PI * (radius * radius) * height;
    }
}
