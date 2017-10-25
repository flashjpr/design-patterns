public class PizzaFactory extends BasePizzaFactory {

  @Override
  public Pizza createPizza(String type) {
    Pizza pizza;
    switch (type.toLowerCase()) {
      case "btc":
        pizza = new BitcoinPizza();
        break;
      case "eth":
        pizza = new EthereumPizza();
        break;
      default: throw new IllegalArgumentException("No such pizza");
    }

    pizza.addIngredients();
    pizza.bakePizza();
    return pizza;
  }
}
