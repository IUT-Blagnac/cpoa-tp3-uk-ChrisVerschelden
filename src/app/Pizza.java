package app;

import java.util.ArrayList;

public abstract class Pizza {

    protected String name;
    protected String crust;
    protected String sauce;
    protected ArrayList<String> garnitures;

    public void prepare(){
        System.out.println("Spread the pizza dough...");
        System.out.println("Add the sauce...");
        if(this.garnitures.size()>-1)
            System.out.println("Add the garnitures:");
            for(String s : this.garnitures)
                System.out.println(" " + s);
    }

    public void bake(){
        System.out.println("Bake 25 minutes at 180°");
    }

    public void cut(){
        System.out.println("Cut the pizza in triangles");
    }

    public void wrap(){
        System.out.println("Put the pizza in the official box");
    }

    public String getName(){
        return "nulle";
    }

}