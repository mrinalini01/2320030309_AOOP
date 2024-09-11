package com.onlineAuctionSystem;

public class OnlineAuctionSystem {
    public static void main(String[] args) {
        // Create an auction
        Auction auction = new Auction();

        // Create bidders
        Bidder bidder1 = new Bidder("Bidder 1");
        Bidder bidder2 = new Bidder("Bidder 2");

        // Subscribe bidders to auction notifications
        auction.addObserver(bidder1);
        auction.addObserver(bidder2);

        // Conduct a standard auction
        AuctionTemplate standardAuction = new StandardAuction();
        standardAuction.conductAuction();

        // Notify bidders about auction events
        auction.startAuction();
        auction.endAuction();

        // remove a bidder
        auction.removeObserver(bidder1);

        // Conduct a reserve auction
        AuctionTemplate reserveAuction = new ReserveAuction();
        reserveAuction.conductAuction();

        // Notify remaining bidders about auction events
        auction.startAuction();
        auction.endAuction();
    }
}
