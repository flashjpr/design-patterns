package auction.javaapi;

import java.math.BigDecimal;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by mihai-mbp on 22/10/2017.
 */
public class Product extends Observable{

    private String productName;
    private BigDecimal bidAmount;
    private Observer highestBidder;

    public Product(String productName, BigDecimal bidAmount) {
        this.productName = productName;
        this.bidAmount = bidAmount;
        System.out.println("Product: " + productName + " is now on live auction. Start price = " + bidAmount);
    }

    public void setBidAmount(Observer observer, BigDecimal newBid) {

        if (newBid.compareTo(bidAmount) == 1) {
            bidAmount = newBid;
            highestBidder = observer;
            setChanged();   // marks this Observable as having been changed
            notifyObservers();
        } else {
            System.out.println("Bid less or equal than the current highest bid: " + this.bidAmount);
        }
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getBidAmount() {
        return bidAmount;
    }

    public Observer getHighestBidder() {
        return highestBidder;
    }
}
