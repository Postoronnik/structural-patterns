package bridge.shapes;

import bridge.colors.Color;
import lombok.ToString;

@ToString(callSuper = true)
public class Circle extends Shape{

    public Circle(Color color){
        super(color);
    }
}
