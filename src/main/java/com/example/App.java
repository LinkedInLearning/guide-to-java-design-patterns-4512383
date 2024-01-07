package com.example;

public class App {

    public static void main(String[] args) {

        var trafficLight = new TrafficLight();
        var pedestrianCrossingLight = new PedestrianCrossingLight();

        trafficLight.changeToAmber();
        trafficLight.changeToGreen(pedestrianCrossingLight);
        trafficLight.changeToAmber();
        trafficLight.changeToRed(pedestrianCrossingLight);


    }

}
