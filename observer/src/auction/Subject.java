package auction;

import java.math.BigDecimal;

/**
 * Created by mihai-mbp on 20/10/2017.
 */
public interface Subject {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
    public void setBidAmount(Observer observer, BigDecimal newBidValue);
}
