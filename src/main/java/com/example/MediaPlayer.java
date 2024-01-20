package com.example;

public class MediaPlayer {
    private PlayerState state;

    public MediaPlayer() {
        this.state = new PausedState();
    }

    public void pressButton() {
        state.pressButton(this);
    }

    public void play() {
        System.out.println("Playing");
        System.out.println("Displaying pause icon");
    }

    public void pause() {
        System.out.println("Paused");
        System.out.println("Displaying play icon");
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

}
