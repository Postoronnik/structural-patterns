package adapter.start.point;

import adapter.adapter.CircleToSquareAdapter;
import adapter.adapter.SquareToCircleAdapter;
import adapter.shapes.Circle;
import adapter.shapes.Shape;
import adapter.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(4);

        System.out.println(shape);

        shape = CircleToSquareAdapter.convertToSquare((Circle) shape);

        System.out.println(shape);

        shape = new Square(6);

        System.out.println(shape);

        shape = SquareToCircleAdapter.convertToSquare((Square) shape);

        System.out.println(shape);
    }
}
