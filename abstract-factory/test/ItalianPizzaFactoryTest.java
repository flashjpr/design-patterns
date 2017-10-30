import org.junit.Test;

public class ItalianPizzaFactoryTest {

    @Test
    public void testCreatePizza() throws IllegalArgumentException {
        BasePizzaFactory pizzaFactory = new ItalianPizzaFactory();
        pizzaFactory.createPizza("cheese");
        pizzaFactory.createPizza("pepperoni");
    }
}
