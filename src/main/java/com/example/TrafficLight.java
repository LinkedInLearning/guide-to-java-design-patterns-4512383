package com.example;

public class TrafficLight {

    public enum Color {
        RED, AMBER, GREEN
    }

    private Color color = Color.RED;

    public void changeToRed(PedestrianCrossingLight pedestrianCrossingLight) {
        color = Color.RED;
        System.out.println("Traffic light is red");
        pedestrianCrossingLight.changeToGreen();
    }

    public void changeToAmber() {
        color = Color.AMBER;
        System.out.println("Traffic light is amber");
    }

    public void changeToGreen(PedestrianCrossingLight pedestrianCrossingLight) {
        pedestrianCrossingLight.changeToRed();
        color = Color.GREEN;
        System.out.println("Traffic light is green");

    }

}
