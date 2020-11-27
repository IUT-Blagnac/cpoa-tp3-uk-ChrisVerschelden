package app;

public abstract class Pizzeria {

    Pizzeria(PizzaFactory pizzaFactory){}

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.wrap();
		return pizza;
    }

    protected Pizza createPizza(String type){
        Pizza pizza = null;
        switch(type){
            default:
                System.out.println("no corresponding pizza");
        }
        return pizza;
    }

}