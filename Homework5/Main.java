public class Main {
    public static void main(String[] args) {
        CoffeeMachine simpleMachine = new SimpleCoffeeMachine();
        // Creăm obiectul CoffeeLover și îi pasăm mașina de cafea simplă
        CoffeeLover coffeeLover = new CoffeeLover(simpleMachine);

        // Facem cafea folosind mașina de cafea simplă
        coffeeLover.makeCoffee();
    }
}
