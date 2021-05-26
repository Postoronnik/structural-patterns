package adapter.shapes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Circle implements Shape{
    private int radius;
}
