package coffeeshop;

import cofeeshop.AddonDecorator;
import cofeeshop.Beverage;
import cofeeshop.Espresso;
import cofeeshop.Milk;
import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoffeShopDecoratorTest {

    @Test
    public void testEspressoWithMilkPrice() {
        Beverage espresso = new Espresso();
        assertEquals("Price of a single espresso is not as expected", 3, espresso.cost());

        AddonDecorator espressoWithMilk = new Milk(new Espresso());
        assertEquals("Price of an expresso with milk is not as expected", 4, espressoWithMilk.cost());
    }
}