public class Main {
    public static void main(String[] args) {
        // Creăm o instanță a clasei Drawing
        Drawing drawing = new Drawing();

        // Adăugăm forme la desen
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());

        // Desenăm formele
        drawing.drawShapes();
    }
}