public class CoffeeLover {
    private CoffeeMachine coffeeMachine;

    public CoffeeLover(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void makeCoffee() {
        coffeeMachine.start();
    }
}