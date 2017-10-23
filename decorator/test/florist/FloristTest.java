package florist;

import org.junit.Assert;
import org.junit.Test;

public class FloristTest {

    @Test
    public void createFlowerBouquetsWithFeatures() {

        // a gorgeous, simple bouquet of liliac
        FlowerBouquet lilacBouquet = new LilacBouquet();
        Assert.assertEquals("Lilac bouquet price is incorrect", 15.2, lilacBouquet.cost(), 0.0000000000000);

        // a stunning lily bouquet with paper wrapper
        FlowerBouquet lilyBouquetDecorated = new LilyBouquet();
        lilyBouquetDecorated = new PaperWrapper(lilyBouquetDecorated);
        Assert.assertEquals("Lily bouquet with paper wrap price is incorrect", 13.5 + 2, lilyBouquetDecorated.cost(), 0.0000000000000);

        // florist's special: peony bouquet with paper wrapper and ribbon bow
        FlowerBouquet peonyBouquetDecorated = new PeonyBouquet();
        peonyBouquetDecorated = new PaperWrapper(peonyBouquetDecorated);
        peonyBouquetDecorated = new RibbonBow(peonyBouquetDecorated);
        Assert.assertEquals("Peony bouquet with paper wrap and ribbon bow is incorect", 21.2 + 2 + 3.1, peonyBouquetDecorated.cost(), 0.0000000000000);
    }
}
