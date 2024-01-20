package com.example;

public class Auction {
    private boolean isOpen;

    public Auction() {
        this.isOpen = false;
    }

    public void startAuction() {
        if (isOpen) {
            System.out.println("Auction already started");
        } else {
            this.isOpen = true;
            System.out.println("Auction started");
        }
    }

    public void closeAuction() {
        if (!isOpen) {
            System.out.println("Auction already closed");
        } else {
            this.isOpen = false;
            System.out.println("Auction closed");
        }
    }

    public void placeBid() {
        if (this.isOpen) {
            System.out.println("Bid placed");
        } else {
            System.out.println("Bid not placed because auction is closed");
        }
    }

}
