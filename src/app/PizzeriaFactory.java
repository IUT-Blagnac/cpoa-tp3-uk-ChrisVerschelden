package app;

public class PizzeriaFactory {

    protected static PizzeriaFactory uniqueInstance = new PizzeriaFactory();

    private PizzeriaFactory() {}

    public Pizzeria create(String pPizzeriaName) {
        Pizzeria pizzeria = null;
        switch (pPizzeriaName) {
            case "Brest":
                pizzeria = new PizzeriaBrest(PizzaFactoryBrest.getInstance());
                break;
            case "Strasbourg":
                pizzeria = new PizzeriaStrasbourg(PizzaFactoryStrasbourg.getInstance());
                break;
            default:
                System.out.println("no pizzeria style specified");
                break;
        }
        return pizzeria;
    }

    public static PizzeriaFactory getInstance() {
        return uniqueInstance;
    }

}
