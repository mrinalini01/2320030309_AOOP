package com.onlineAuctionSystem;

//Concrete class for Standard Auction
class StandardAuction extends AuctionTemplate {
 @Override
 protected void initializeAuction() {
     System.out.println("Initializing standard auction...");
 }

 @Override
 protected void startBidding() {
     System.out.println("Starting standard auction bidding...");
 }

 @Override
 protected void endBidding() {
     System.out.println("Ending standard auction bidding...");
 }

 @Override
 protected void finalizeAuction() {
     System.out.println("Finalizing standard auction...");
 }
}

