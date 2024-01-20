package com.example;

public class Auction {
    private AuctionState state;

    public Auction() {
        this.state = new AuctionClosedState();
    }

    public void startAuction() {
        state.startAuction(this);
    }

    public void closeAuction() {
        state.closeAuction(this);
    }

    public void placeBid() {
        state.placeBid();
    }

    public void setState(AuctionState state) {
        this.state = state;
    }

}
