// StandardAuction.java
public class StandardAuction extends AuctionProcess {

    @Override
    protected void itemAvailable() {
        System.out.println("Item is available for a standard auction.");
    }

    @Override
    protected void startBidding() {
        System.out.println("Bidding has started for the standard auction.");
    }

    @Override
    protected void handleBids() {
        System.out.println("Handling bids for the standard auction.");
    }

    @Override
    protected void endBidding() {
        System.out.println("Bidding has ended for the standard auction.");
    }
}
