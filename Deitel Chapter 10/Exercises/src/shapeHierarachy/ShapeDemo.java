package shapeHierarachy;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];

        shapes[0] = new Circle(7);
        shapes[1] = new Square(5);
        shapes[2] = new Triangle(5, 8);
        shapes[3] = new Sphere(11);
        shapes[4] = new Cube(10);
        shapes[5] = new Tetrahedron(21);

        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName());
            System.out.println(shape);
            System.out.println();
        }

    }
}
