package com.example;

public class AuctionClosedState implements AuctionState {

    @Override
    public void startAuction(Auction auction) {
        auction.setState(new AuctionStartedState());
        System.out.println("Auction started");
    }

    @Override
    public void closeAuction(Auction auction) {
        System.out.println("Auction already closed");
    }

    @Override
    public void placeBid() {
        System.out.println("Bid not placed because auction is closed");
    }

}
