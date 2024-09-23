// Client.java
public class Client {
    public static void main(String[] args) {
        // Create an auction for an item
        Auction auction = new Auction("Antique Vase");

        // Create bidders
        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");
        Bidder bidder3 = new Bidder("Charlie");

        // Register bidders to receive auction notifications
        auction.registerObserver(bidder1);
        auction.registerObserver(bidder2);

        // Start the auction
        auction.auctionStart();

        // Conduct a standard auction
        AuctionProcess standardAuction = new StandardAuction();
        standardAuction.conductAuction();

        // Unsubscribe one bidder
        auction.removeObserver(bidder1);

        // Conduct a reserve auction
        AuctionProcess reserveAuction = new ReserveAuction(500.0);
        reserveAuction.conductAuction();

        // End the auction
        auction.auctionEnd();
    }
}
