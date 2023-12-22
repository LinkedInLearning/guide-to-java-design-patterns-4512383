package com.example;

public class MusicPlayer {

    public static void main(String[] args) {
        var user = new User("Jill");
        loadHomePage(user);
        loadDiscoverPage(user);
    }

    private static void loadHomePage(User user) {
        System.out.println("Loading home page...");
        var recommendations = new SongRecommendations(user);
        recommendations.showRecommendations(user);
    }

    private static void loadDiscoverPage(User user) {
        System.out.println("Loading discover page...");
        var recommendations = new SongRecommendations(user);
        recommendations.showRecommendations(user);
    }

}
