package com.example;

public class App {

    private static final MediaPlayerProxy movieMediaPlayer = new MediaPlayerProxy();

    public static void main(String[] args) {
        goToMovieLibrary(movieMediaPlayer);
        goToFavoriteMovies(movieMediaPlayer);
    }

    private static void goToMovieLibrary(MediaPlayerProxy movieMediaPlayer) {
        System.out.println("Loading movie library...");
        movieMediaPlayer.playMedia();
    }

    private static void goToFavoriteMovies(MediaPlayerProxy movieMediaPlayer) {
        System.out.println("Loading favorite movies...");
        movieMediaPlayer.playMedia();
    }

}
