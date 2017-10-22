package auction;

import auction.javaapi.Product;
import auction.javaapi.Bidder;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by mihai-mbp on 22/10/2017.
 */
public class ObserverJavaAPITest {

    @Test
    public void testing() {

        Product headphones = new Product("Bose Headphones QC 35", new BigDecimal(200));
        Bidder bidder1 = new Bidder("Larisa");
        Bidder bidder2 = new Bidder("Alex");
        headphones.addObserver(bidder1);
        headphones.addObserver(bidder2);
        headphones.setBidAmount(bidder1, new BigDecimal(240));
        headphones.setBidAmount(bidder2, new BigDecimal(250));
        headphones.setBidAmount(bidder1, new BigDecimal(290));
        headphones.setBidAmount(bidder2, new BigDecimal(330));
        headphones.deleteObserver(bidder1);
    }
}
