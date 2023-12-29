package com.example;

public class App {

    public static void main(String[] args) {
        var movieMediaPlayer = new MovieMediaPlayerProxy();
        goToMovieLibrary(movieMediaPlayer);
        goToFavoriteMovies(movieMediaPlayer);
    }

    private static void goToMovieLibrary(MovieMediaPlayerProxy movieMediaPlayer) {
        System.out.println("Loading movie library...");
        movieMediaPlayer.playMedia();
    }

    private static void goToFavoriteMovies(MovieMediaPlayerProxy movieMediaPlayer) {
        System.out.println("Loading favorite movies...");
        movieMediaPlayer.playMedia();
    }

}
