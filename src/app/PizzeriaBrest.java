package app;

public class PizzeriaBrest extends Pizzeria{

    PizzeriaBrest(PizzaFactory pizzaFactory) {
        this.pizzaFactory = PizzaFactoryBrest.getInstance();
    }

}
