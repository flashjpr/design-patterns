package florist;

public class PeonyBouquet extends FlowerBouquet {

    public PeonyBouquet() {
        super.name = "Peony bouquet";
    }

    @Override
    public double cost() {
        return 21.2;
    }
}
