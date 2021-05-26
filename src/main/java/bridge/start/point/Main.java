package bridge.start.point;

import bridge.colors.Blue;
import bridge.colors.Green;
import bridge.colors.Red;
import bridge.shapes.Circle;
import bridge.shapes.Shape;
import bridge.shapes.Square;
import bridge.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(new Red());
        System.out.println(shape);

        shape = new Square(new Green());
        System.out.println(shape);

        shape = new Triangle(new Blue());
        System.out.println(shape);
    }
}
