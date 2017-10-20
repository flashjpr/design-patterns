package auction;

import java.math.BigDecimal;

/**
 * Created by mihai-mbp on 20/10/2017.
 */
public interface Observer {

    // this should suffice for this bare simple example. some real-world scenarios might be sending
    // emails or SMSs to the observers
    public void update(Observer observer, String productName, BigDecimal bidAmount);
}
