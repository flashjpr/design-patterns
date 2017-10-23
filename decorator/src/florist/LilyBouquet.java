package florist;

public class LilyBouquet extends FlowerBouquet {

    public LilyBouquet() {
        super.name = "Lily bouquet";
    }

    @Override
    public double cost() {
        return 13.5;
    }
}
