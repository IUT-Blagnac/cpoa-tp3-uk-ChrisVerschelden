package app;

import java.util.ArrayList;

public class PizzaCheeseStyleStrasbourg extends Pizza {

    PizzaCheeseStyleStrasbourg(){
        this.garnitures = new ArrayList<String>();
        this.garnitures.add("Mozzarella");
        System.out.println("Preparation of Pizza Strasbourg style with cheese");
    }

    @Override
    public String getName(){
        return "Pizza with Strasbourg style sauce and cheese";
    }

    @Override
    public void cut(){
        System.out.println("Cut in square portions");
    }
}