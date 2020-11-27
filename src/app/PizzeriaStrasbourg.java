package app;

public class PizzeriaStrasbourg extends Pizzeria{

    PizzeriaStrasbourg(PizzaFactory pizzaFactory){
        super(pizzaFactory);
    }
    
    @Override
    public Pizza createPizza(String name){
        Pizza pizza = null;
        switch(name){
            case "cheese":
                pizza = new PizzaCheeseStyleStrasbourg();
                break;
            default:
                System.out.println("no pizza type as been specified");
        }
        return pizza;
    }
}
