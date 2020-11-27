package app;

public class PizzaFactoryStrasbourg extends PizzaFactory {

    protected static PizzaFactoryStrasbourg uniqueInstance = new PizzaFactoryStrasbourg();

    private PizzaFactoryStrasbourg() {
        
    }

    public static PizzaFactoryStrasbourg getInstance(){
        return uniqueInstance;
    }

    @Override
    public Pizza create(String name){
        Pizza pizza = null;
        switch(name){
            case "cheese":
                pizza = new PizzaCheeseStyleStrasbourg();
                break;
            default:
                System.out.println("no corresponding pizza");
        }

        return pizza;
    }

    
}
