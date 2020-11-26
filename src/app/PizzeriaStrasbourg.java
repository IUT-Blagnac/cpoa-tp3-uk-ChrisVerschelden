package app;

public class PizzeriaStrasbourg extends Pizzeria{

    PizzeriaStrasbourg(PizzaFactory pizzaFactory){
        super(pizzaFactory);
    }
    
    @Override
    public Pizza orderPizza(String name){
        Pizza pizza = null;
        switch(name){
            case "cheese":
                pizza = new PizzaCheeseStyleStrasbourg();
                this.createPizza(pizza);
                break;
            default:
                System.out.println("no pizza type as been specified");
        }
        return pizza;
    }
}
