package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import app.Pizza;
import app.Pizzeria;
import app.PizzeriaFactory;

public class PizzeriaTest {

    @Test
    public void anOrderedPizzaIsNotNull() {
    	
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().create("Brest");
        Pizza miam = boutiqueBrest.orderPizza("cheese");
        assertNotNull("An Ordered Pizza Is Not Null",miam);
    }

    @Test
    public void twoOrderedPizzasAreDifferent() {
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().create("Brest");
        Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().create("Strasbourg");
        Pizza miam1 = boutiqueBrest.orderPizza("cheese");
        Pizza miam2 = boutiqueStrasbourg.orderPizza ("cheese");
        assertNotEquals("Two Ordered Pizzas Are Different",miam1,miam2);
    }
    
 
    @Test
    public void twoPizzeriaFactoryAreTheSame() {
    	PizzeriaFactory factory1 = PizzeriaFactory.getInstance();
    	PizzeriaFactory factory2 = PizzeriaFactory.getInstance();
    	assertEquals("Factory is the same", factory1, factory2);
    }
    
}