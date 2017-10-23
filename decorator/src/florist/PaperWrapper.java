package florist;

public class PaperWrapper extends FlowerBouquetDecorator {

    FlowerBouquet flowerBouquet;

    public PaperWrapper(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return this.flowerBouquet.getName() + ", paper wrapper";
    }

    @Override
    public double cost() {
        return this.flowerBouquet.cost() + 2;
    }
}
