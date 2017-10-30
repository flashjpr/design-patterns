import ingredients.Cheese;
import ingredients.GoatCheese;
import ingredients.Sauce;
import ingredients.SpicySauce;

public class GourmetToppingFactory extends BaseToppingFactory {
    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Sauce createSauce() {
        return new SpicySauce();
    }
}
