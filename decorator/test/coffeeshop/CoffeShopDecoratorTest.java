import cofeeshop.Beverage;
import cofeeshop.Espresso;
import org.junit.Test;

class CoffeShopDecoratorTest {

    @Test
    public void testEspressoWithMilkPrice() {

        Beverage espresso = new Espresso();
        System.out.println(espresso.cost());
    }
}