import topings.BaseToppingFactory;

public class CheesePizza extends Pizza {

    BaseToppingFactory toppingFactory;

    public CheesePizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for the cheese pizza");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
