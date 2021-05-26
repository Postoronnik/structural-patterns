package bridge.shapes;

import bridge.colors.Color;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }
}
