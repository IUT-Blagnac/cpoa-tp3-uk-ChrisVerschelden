package app;

public class PizzeriaBrest extends Pizzeria{

    PizzeriaBrest(PizzaFactory pizzaFactory) {
        super(pizzaFactory);
    }

    @Override
    public Pizza createPizza(String name){
        Pizza pizza = null;
        switch(name){
            case "cheese":
                pizza = new PizzaCheeseStyleBrest();
                break;
            default:
                System.out.println("no pizza type as been specified");
        }
        return pizza; 
    }

}
