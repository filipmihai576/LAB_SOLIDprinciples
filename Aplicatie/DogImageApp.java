import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;

public class DogImageApp extends JFrame {

    public DogImageApp() {
        setTitle("Random Dog Image");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
    }

    public static void showDogImageApp() {
        DogImageApp app = new DogImageApp();

        try {
            // Realizează o cerere HTTP către API-ul Dog.ceo pentru a obține o imagine aleatorie de câine
            URL apiUrl = new URL("https://dog.ceo/api/breeds/image/random");
            HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Parsează răspunsul JSON pentru a obține URL-ul imaginii
                String responseBody = new String(connection.getInputStream().readAllBytes());
                String imageUrl = responseBody.split("\"message\":\"")[1].split("\",")[0];

                // Descarcă imaginea și salvează-o local
                BufferedImage image = ImageIO.read(new URL(imageUrl));
                ImageIO.write(image, "jpg", new java.io.File("dog_image.jpg"));

                // Afisează imaginea într-o fereastră a aplicației desktop
                ImageIcon icon = new ImageIcon(image);
                JLabel label = new JLabel(icon);
                app.getContentPane().add(label, BorderLayout.CENTER);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        app.setVisible(true);
    }
}
