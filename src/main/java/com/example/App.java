package com.example;

public class App {

    public static void main(String[] args) {

        var user1 = new User();
        var user2 = new User();
        var newsfeed = new Newsfeed();

        user1.addPropertyChangeListener(newsfeed);
        user2.addPropertyChangeListener(newsfeed);

        user1.setStatus("Going for a walk");
        user2.setStatus("Enjoying a coffee");

        newsfeed.printStatuses();
    }

}
