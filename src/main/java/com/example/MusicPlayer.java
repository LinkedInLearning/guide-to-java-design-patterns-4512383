package com.example;

public class MusicPlayer {

    public static void main(String[] args) {
        goToMovieLibrary();
        goToFavoriteMovies();
    }

    private static void goToMovieLibrary() {
        System.out.println("Loading movie library...");
        var musicPlayer = new MovieMediaPlayer();
        musicPlayer.playMedia();
    }

    private static void goToFavoriteMovies() {
        System.out.println("Loading favorite movies...");
        var musicPlayer = new MovieMediaPlayer();
        musicPlayer.playMedia();
    }

}
