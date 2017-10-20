package auction;

import java.math.BigDecimal;

/**
 * Created by mihai-mbp on 20/10/2017.
 */
public class Bidder implements Observer {

    String bidderName;
    public Bidder (String bidderName) {
        this.bidderName = bidderName;
    }

    @Override
    public void update(Observer observer, String productName, BigDecimal bidAmount) {

        if(observer.toString().equals(bidderName))
            System.out.println("Hi, " + bidderName + ". You are the highest bidder for the product " + productName + " with bid = " + bidAmount);
        if(!observer.toString().equals(bidderName))
            System.out.println("Hi, " + bidderName + ". The highest bidder for the product " + productName + " with bid = " + bidAmount + " is " + observer);
    }

    @Override
    public String toString() {
        return bidderName;
    }
}
