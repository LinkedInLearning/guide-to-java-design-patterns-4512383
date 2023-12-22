package com.example;

public class MusicPlayer {

    public static void main(String[] args) {
        var user = new User("Jill");
        var recommendations = new SongRecommendations(user);
        loadHomePage(user, recommendations);
        loadDiscoverPage(user, recommendations);
    }

    private static void loadHomePage(User user, SongRecommendations recommendations) {
        System.out.println("Loading home page...");
        recommendations.showRecommendations(user);
    }

    private static void loadDiscoverPage(User user, SongRecommendations recommendations) {
        System.out.println("Loading discover page...");
        recommendations.showRecommendations(user);
    }

}
