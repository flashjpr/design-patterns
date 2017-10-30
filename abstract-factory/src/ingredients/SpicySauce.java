package products;

public class SpicySauce implements Sauce {

    public SpicySauce() {
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("Preparing spicy sauce");
    }
}
