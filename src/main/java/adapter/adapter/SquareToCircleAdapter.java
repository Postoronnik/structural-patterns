package adapter.adapter;

import adapter.shapes.Circle;
import adapter.shapes.Square;

public class SquareToCircleAdapter {

    public static Circle convertToSquare(Square square){
        return new Circle(square.getSide()/2);
    }
}
