package com.example;

public class MovieMediaPlayerProxy implements MediaPlayer {

    private MovieMediaPlayer movieMediaPlayer;

    @Override
    public void playMedia() {
        if (movieMediaPlayer == null) {
            movieMediaPlayer = new MovieMediaPlayer();
        }
        movieMediaPlayer.playMedia();
    }
}
