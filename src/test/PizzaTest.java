package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

import app.PizzaFactory;
import app.PizzaFactoryBrest;
import app.PizzaFactoryStrasbourg;

public class PizzaTest {
	@Test
    public void twoPizzaFactoryBrestAreTheSame () {
    	PizzaFactory fact1 = PizzaFactoryBrest.getInstance();
    	PizzaFactory fact2 = PizzaFactoryBrest.getInstance();
    	assertEquals("Factory Style brest is the same", fact1, fact2);
    }
    
    @Test
    public void twoPizzaFactoryStrasBourgAreTheSame () {
    	PizzaFactory fact1 = PizzaFactoryBrest.getInstance();
    	PizzaFactory fact2 = PizzaFactoryBrest.getInstance();
    	assertEquals("Factory Style brest is the same", fact1, fact2);
    }
    
    @Test
    public void twoPizzaFactoryFromDifferentFactoryAreNotTheSame() {
    	PizzaFactory fact1 = PizzaFactoryStrasbourg.getInstance();
    	PizzaFactory fact2 = PizzaFactoryBrest.getInstance();
    	assertNotEquals("Factory Style brest is different of factory Style Strasbourg", fact1, fact2);
    }
}
