import java.util.ArrayList;
import java.util.List;
public class Drawing {
    private List<Shape> shapes;

    public Drawing() {
        this.shapes = new ArrayList<>();
    }

    // Metodă pentru adăugarea de forme
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    // Metodă pentru desenarea tuturor formelor
    public void drawShapes() {
        shapes.forEach(Shape::draw);
    }
}