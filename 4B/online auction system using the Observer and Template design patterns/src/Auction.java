// Auction.java
import java.util.ArrayList;
import java.util.List;

public class Auction implements Subject {
    private List<Observer> bidders = new ArrayList<>();
    private String itemName;

    public Auction(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public void registerObserver(Observer observer) {
        bidders.add(observer);
        System.out.println(((Bidder) observer).getName() + " subscribed to the auction.");
    }

    @Override
    public void removeObserver(Observer observer) {
        bidders.remove(observer);
        System.out.println(((Bidder) observer).getName() + " unsubscribed from the auction.");
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer bidder : bidders) {
            bidder.update(message);
        }
    }

    // Auction events
    public void auctionStart() {
        System.out.println("Auction for " + itemName + " has started!");
        notifyObservers("Auction started for item: " + itemName);
    }

    public void auctionEnd() {
        System.out.println("Auction for " + itemName + " has ended.");
        notifyObservers("Auction ended for item: " + itemName);
    }
}
