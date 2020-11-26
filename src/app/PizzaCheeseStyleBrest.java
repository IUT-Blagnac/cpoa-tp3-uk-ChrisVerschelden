package app;

import java.util.ArrayList;

public class PizzaCheeseStyleBrest extends Pizza {

    PizzaCheeseStyleBrest(){
        this.garnitures = new ArrayList<String>();
        this.garnitures.add("Parmigiano reggiano");
        System.out.println("Preparation of Pizza with Brest style sauce and cheese");
    }

    @Override
    public String getName(){
        return "Pizza with Brest style sauce and cheese";
    }
}