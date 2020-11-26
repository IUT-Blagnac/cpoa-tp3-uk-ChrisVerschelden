package app;

public abstract class Pizzeria {

    Pizzeria(PizzaFactory pizzaFactory){}

    public Pizza orderPizza(String name){
        Pizza pizza = null;
        switch(name){
            default:
                System.out.println("no corresponding pizza");
        }

        return pizza;
    }

    public void create(String pizzaName){
        System.out.println(pizzaName);
    }

    protected Pizza createPizza(Pizza pizza){
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.wrap();
		return pizza;
    }

}