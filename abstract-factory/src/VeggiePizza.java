import topings.BaseToppingFactory;

public class VeggiePizza extends Pizza {

    BaseToppingFactory toppingFactory;

    public VeggiePizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for the vegetarian pizza");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
