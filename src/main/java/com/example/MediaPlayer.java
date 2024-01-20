package com.example;

public class MediaPlayer {
    private boolean isPlaying;

    public MediaPlayer() {
        this.isPlaying = false;
    }

    public void pressButton() {
        if (this.isPlaying) {
            pause();
        } else {
            play();
        }
    }

    public void play() {
        this.isPlaying = true;
        System.out.println("Playing");
        System.out.println("Displaying pause icon");
    }

    public void pause() {
        this.isPlaying = false;
        System.out.println("Paused");
        System.out.println("Displaying play icon");
    }

}
