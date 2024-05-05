public class Main {
    public static void main(String[] args) {
        CoffeeLover coffeeLover = new CoffeeLover();

        // Adăugăm mașini de cafea folosind metoda publică
        coffeeLover.addCoffeeMachine(new SimpleCoffeeMachine());
        coffeeLover.addCoffeeMachine(new ComplexCoffeeMachine());

        // Facem cafea folosind mașinile de cafea disponibile
        coffeeLover.makeCoffee();
    }
}
