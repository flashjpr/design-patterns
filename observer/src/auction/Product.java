package auction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mihai-mbp on 20/10/2017.
 */

public class Product implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private String productName;
    private BigDecimal bidAmount;
    private Observer highestBidder;

    public Product(String productName, BigDecimal bidAmount) {
        this.productName = productName;
        this.bidAmount = bidAmount;
        System.out.println("Product: " + productName + " is now on live auction. Start price = " + bidAmount);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("A new bid has been placed");
        observers.forEach(observer -> observer.update(this.highestBidder, this.productName,this.bidAmount));
    }

    @Override
    public void setBidAmount(Observer observer, BigDecimal newBidValue) {

        if (newBidValue.compareTo(bidAmount) == 1) {
            this.bidAmount = newBidValue;
            this.highestBidder = observer;
            notifyObservers();
        } else {
            System.out.println("Bid less or equal than the current highest bid: " + this.bidAmount);
        }

    }
}
