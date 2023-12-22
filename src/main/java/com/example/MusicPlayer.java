package com.example;

public class MusicPlayer {

    private static final RecommendationsProxy recommendationsProxy = new RecommendationsProxy();

    public static void main(String[] args) {
        var user = new User("Jill", false);
        loadHomePage(user);
        loadDiscoverPage(user);
    }

    private static void loadHomePage(User user) {
        System.out.println("Loading home page...");
        recommendationsProxy.showRecommendations(user);
    }

    private static void loadDiscoverPage(User user) {
        System.out.println("Loading discover page...");
        recommendationsProxy.showRecommendations(user);
    }

}
