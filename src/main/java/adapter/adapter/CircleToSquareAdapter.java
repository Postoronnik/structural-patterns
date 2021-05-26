package adapter.adapter;


import adapter.shapes.Circle;
import adapter.shapes.Square;

public class CircleToSquareAdapter{

    public static Square convertToSquare(Circle circle){
        return new Square(circle.getRadius() * 2);
    }
}
