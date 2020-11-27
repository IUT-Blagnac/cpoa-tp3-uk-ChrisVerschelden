package app;

public class PizzeriaStrasbourg extends Pizzeria{

    PizzeriaStrasbourg(PizzaFactory pizzaFactory){
        this.pizzaFactory = PizzaFactoryStrasbourg.getInstance();
    }
    
}
