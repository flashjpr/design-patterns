import org.junit.Test;

public class GourmetPizzaFactoryTest {

    @Test
    public void testCreatePizza() throws IllegalArgumentException {
        BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
        pizzaFactory.createPizza("cheese");
        pizzaFactory.createPizza("veggie");
    }
}
