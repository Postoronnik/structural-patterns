package bridge.shapes;

import bridge.colors.Color;
import lombok.ToString;

@ToString(callSuper = true)
public class Triangle extends Shape {

    public Triangle(Color color){
        super(color);
    }

}
