import java.util.ArrayList;
import java.util.List;

public class sumAreas {
    public static void main(String[] args) {
        List<Shape> shapesList = new ArrayList<>();
        shapesList.add(new Circle(2));
        shapesList.add(new Rectangle(1, 3));
        shapesList.add(new Circle(1));

        double totalArea = computeTotalArea(shapesList);
        System.out.println("Total Area: " + totalArea);
    }

    private static double computeTotalArea(List<Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            double area = shape.getArea();
            System.out.println("Area " + shape.getClass().getSimpleName() + " :" + area);
            totalArea += area;
        }
        return totalArea;
    }
}
