package app;

public class PizzaFactoryBrest extends PizzaFactory {

    protected static PizzaFactoryBrest uniqueInstance = new PizzaFactoryBrest();

    private PizzaFactoryBrest(){
        
    }

    public static PizzaFactoryBrest getInstance(){
        return uniqueInstance;
    }

    @Override
    public Pizza create(String name){
        Pizza pizza = null;
        switch(name){
            case "cheese":
                pizza = new PizzaCheeseStyleBrest();
                break;
            default:
                System.out.println("no corresponding pizza");
        }

        return pizza;
    }
    

}
