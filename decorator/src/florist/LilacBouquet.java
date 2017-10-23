package florist;

public class LilacBouquet extends FlowerBouquet {

    public LilacBouquet(){
        super.name = "Lilac bouquet";
    }

    @Override
    public double cost() {
        return 15.2;
    }
}
