package com.example;

public class RecommendationsProxy implements Recommendations {

    private Recommendations recommendations;

    @Override
    public void showRecommendations(User user) {
        if (recommendations == null) {
          recommendations = new SongRecommendations(user);
        }
        recommendations.showRecommendations(user);
    }

}
