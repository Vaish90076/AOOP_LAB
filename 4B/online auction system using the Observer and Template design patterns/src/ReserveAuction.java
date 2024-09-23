// ReserveAuction.java
public class ReserveAuction extends AuctionProcess {

    private double reservePrice;

    public ReserveAuction(double reservePrice) {
        this.reservePrice = reservePrice;
    }

    @Override
    protected void itemAvailable() {
        System.out.println("Item is available for a reserve auction with reserve price: " + reservePrice);
    }

    @Override
    protected void startBidding() {
        System.out.println("Bidding has started for the reserve auction.");
    }

    @Override
    protected void handleBids() {
        System.out.println("Handling bids for the reserve auction.");
    }

    @Override
    protected void endBidding() {
        System.out.println("Bidding has ended for the reserve auction.");
    }
}
