package com.onlineAuctionSystem;

import java.util.ArrayList;
import java.util.List;


class Auction {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void startAuction() {
        notifyObservers("Auction started!");
    }

    public void endAuction() {
        notifyObservers("Auction ended!");
    }
}

