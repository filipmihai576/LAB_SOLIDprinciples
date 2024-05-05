import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creăm o listă de mașini de cafea și le adăugăm
        List<CoffeeMachine> coffeeMachines = new ArrayList<>();
        coffeeMachines.add(new SimpleCoffeeMachine());
        coffeeMachines.add(new ComplexCoffeeMachine());

        // Creăm obiectul CoffeeLover și îi pasăm lista de mașini de cafea
        CoffeeLover coffeeLover = new CoffeeLover(coffeeMachines);

        // Facem cafea folosind mașinile de cafea disponibile
        coffeeLover.makeCoffee();
    }
}
