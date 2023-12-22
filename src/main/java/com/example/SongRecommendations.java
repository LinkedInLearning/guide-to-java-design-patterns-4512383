package com.example;

public class SongRecommendations implements Recommendations {

    public SongRecommendations(User user) {
        getData(user);
    }

    @Override
    public void showRecommendations(User user) {
        System.out.println("Showing song recommendations for " + user.getName()
                + " based on their top tracks, artists and genres");
    }

    private void getData(User user) {
        System.out.println("Getting " + user.getName() + "'s top tracks from database...");
        System.out.println("Getting " + user.getName() + "'s top artists from database...");
        System.out.println("Getting " + user.getName() + "'s top genres from database...");
    }
}
