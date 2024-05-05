public class Main {
    public static void main(String[] args) {
        // Creăm un array de forme
        Shape[] shapes = {
                new Circle(2),
                new Rectangle(3, 4),
                new Square(5)
        };

        // Calculăm suma ariilor formelor
        double sum = sumAreas(shapes);

        // Afișăm suma ariilor
        System.out.println("Sum of areas: " + sum);
    }

    // Metodă statică pentru calculul sumei ariilor formelor
    public static double sumAreas(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }
}
