import topings.BaseToppingFactory;
import topings.ItalianToppingFactory;

public class ItalianPizzaFactory extends BasePizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        BaseToppingFactory toppingFactory = new ItalianToppingFactory();
        switch (type.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza(toppingFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(toppingFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(toppingFactory);
                break;
            default: throw new IllegalArgumentException("No such pizza");
        }

        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
