package topings;

import ingredients.Cheese;
import ingredients.MozzarellaCheese;
import ingredients.Sauce;
import ingredients.TomatoSauce;

public class ItalianToppingFactory extends BaseToppingFactory {

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
