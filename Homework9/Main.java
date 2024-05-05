public class Main {
    public static void main(String[] args) {
        // Creăm două instanțe diferite de forme
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        // Calculăm aria fiecărei forme folosind interfața Shape
        double areaOfCircle = circle.calculateArea();
        double areaOfRectangle = rectangle.calculateArea();

        // Afișăm rezultatele
        System.out.println("Area of Circle: " + areaOfCircle);
        System.out.println("Area of Rectangle: " + areaOfRectangle);
    }
}