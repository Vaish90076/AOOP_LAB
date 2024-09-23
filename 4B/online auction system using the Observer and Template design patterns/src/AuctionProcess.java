// AuctionProcess.java
public abstract class AuctionProcess {
    
    // Template method defining the auction process structure
    public final void conductAuction() {
        itemAvailable();
        startBidding();
        handleBids();
        endBidding();
    }

    // Steps that can be customized by subclasses
    protected abstract void itemAvailable();
    protected abstract void startBidding();
    protected abstract void handleBids();
    protected abstract void endBidding();
}
