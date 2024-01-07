package com.example;

public class TrafficLight {

    public enum Color {
        RED, AMBER, GREEN
    }

    private Color color = Color.RED;

    public void changeToRed() {
        color = Color.RED;
        System.out.println("Traffic light is red");
    }

    public void changeToAmber() {
        color = Color.AMBER;
        System.out.println("Traffic light is amber");
    }

    public void changeToGreen() {
        color = Color.GREEN;
        System.out.println("Traffic light is green");

    }

}
