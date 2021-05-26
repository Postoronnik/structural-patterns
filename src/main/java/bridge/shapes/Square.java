package bridge.shapes;

import bridge.colors.Color;
import lombok.ToString;

@ToString(callSuper = true)
public class Square extends Shape{

    public Square(Color color){
        super(color);
    }
}
