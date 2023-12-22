package com.example;

public class RecommendationsProxy implements Recommendations {

    private Recommendations recommendations;

    @Override
    public void showRecommendations(User user) {

        if (user.isPremium()) {
            if (recommendations == null) {
                recommendations = new SongRecommendations(user);
            }
            recommendations.showRecommendations(user);
        } else {
            System.out.println("Upgrade to premium to see recommendations");
        }
    }

}
