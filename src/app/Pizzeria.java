package app;

public abstract class Pizzeria {

    protected PizzaFactory pizzaFactory;

    public Pizza orderPizza(String type){
        return createPizza(type);
    }

    protected Pizza createPizza(String type){
        Pizza pizza = pizzaFactory.create(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.wrap();
		return pizza;
    }

}