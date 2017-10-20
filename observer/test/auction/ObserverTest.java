package auction;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by mihai-mbp on 20/10/2017.
 */
public class ObserverTest {

    @Test
    public void testObserver() {
        Subject headphones = new Product("Bose Headphones QC 35", new BigDecimal(210));
        Observer bidder1 = new Bidder("Ed Sheeran");
        Observer bidder2 = new Bidder("Sofia Karlberg");
        headphones.registerObserver(bidder1);
        headphones.registerObserver(bidder2);
        headphones.setBidAmount(bidder1, new BigDecimal(220));
        headphones.setBidAmount(bidder2, new BigDecimal(235));
    }
}
