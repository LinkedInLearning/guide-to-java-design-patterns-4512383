package com.example;

public class MediaPlayer {
    private boolean isPlaying;

    public MediaPlayer() {
        this.isPlaying = false;
    }

    public void pressButton() {
        if (this.isPlaying) {
            pause();
            this.isPlaying = false;
        } else {
            play();
            this.isPlaying = true;
        }
    }

    public void play() {
        System.out.println("Playing");
        System.out.println("Displaying pause icon");
    }

    public void pause() {
        System.out.println("Paused");
        System.out.println("Displaying play icon");
    }

}
