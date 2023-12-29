package com.example;

public class App {

    public static void main(String[] args) {
        goToMovieLibrary();
        goToFavoriteMovies();
    }

    private static void goToMovieLibrary() {
        System.out.println("Loading movie library...");
        var movieMediaPlayer = new MovieMediaPlayer();
        movieMediaPlayer.playMedia();
    }

    private static void goToFavoriteMovies() {
        System.out.println("Loading favorite movies...");
        var movieMediaPlayer = new MovieMediaPlayer();
        movieMediaPlayer.playMedia();
    }

}
