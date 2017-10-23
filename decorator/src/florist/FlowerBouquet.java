package florist;

import java.math.BigDecimal;

public abstract class FlowerBouquet {

    String name;
    public abstract double cost();
    public String getName(){
        return this.name;
    }
}
