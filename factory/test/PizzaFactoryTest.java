import org.junit.Test;

public class PizzaFactoryTest {

  @Test
  public void testBakingPizzas() {

    BasePizzaFactory pizzaFactory = new PizzaFactory();
    Pizza bitcoinPizzaHaHaHa = pizzaFactory.createPizza("BTC");
    Pizza ethereumPizzaHuHuHu = pizzaFactory.createPizza("ETH");
  }
}
