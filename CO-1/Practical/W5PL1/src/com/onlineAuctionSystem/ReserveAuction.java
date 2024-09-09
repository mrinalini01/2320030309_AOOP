package com.onlineAuctionSystem;

class ReserveAuction extends AuctionTemplate {
    @Override
    protected void initializeAuction() {
        System.out.println("Initializing reserve auction...");
    }

    @Override
    protected void startBidding() {
        System.out.println("Starting reserve auction bidding...");
    }

    @Override
    protected void endBidding() {
        System.out.println("Ending reserve auction bidding...");
    }

    @Override
    protected void finalizeAuction() {
        System.out.println("Finalizing reserve auction...");
    }
}
