package auction.javaapi;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by mihai-mbp on 22/10/2017.
 */
public class Bidder implements Observer {

    Product observable;
    private String bidderName;

    public Bidder(String bidderName){
        this.bidderName = bidderName;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.observable = (Product) o;
        String highestBidder = this.observable.getHighestBidder().toString();
        if (highestBidder.equals(bidderName))
                System.out.println("Hi, " + bidderName + ". You are the highest bidder for the product " + observable.getProductName() + " with bid = " + observable.getBidAmount());
        if(!highestBidder.equals(bidderName))
            System.out.println("Hi, " + bidderName + ". The highest bidder for the product " + observable.getProductName() + " with bid = " + observable.getBidAmount() + " is " + highestBidder);
    }

    public String toString() {
        return bidderName;
    }
}
