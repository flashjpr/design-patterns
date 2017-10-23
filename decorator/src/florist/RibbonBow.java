package florist;

public class RibbonBow extends FlowerBouquetDecorator {

    FlowerBouquet flowerBouquet;

    public RibbonBow(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return this.flowerBouquet.getName() + ", ribbon bow";
    }

    @Override
    public double cost() {
        return this.flowerBouquet.cost() + 3.1;
    }
}
