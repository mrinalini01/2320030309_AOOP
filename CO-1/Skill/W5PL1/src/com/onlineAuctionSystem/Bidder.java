package com.onlineAuctionSystem;

//Concrete Observer class
class Bidder implements Observer {
 private String name;

 public Bidder(String name) {
     this.name = name;
 }

 @Override
 public void update(String message) {
     System.out.println(name + " received notification: " + message);
 }
}
