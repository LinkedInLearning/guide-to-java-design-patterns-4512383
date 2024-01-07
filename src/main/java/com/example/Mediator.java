package com.example;

public class Mediator {

    private TrafficLight trafficLight;
    private PedestrianCrossingLight pedestrianCrossingLight;

    public Mediator(TrafficLight trafficLight, PedestrianCrossingLight pedestrianCrossingLight) {
        this.trafficLight = trafficLight;
        this.pedestrianCrossingLight = pedestrianCrossingLight;
    }

    public void changeTrafficLightToRed() {
        trafficLight.changeToRed();
        pedestrianCrossingLight.changeToGreen();
    }

    public void changeTrafficLightToAmber() {
        trafficLight.changeToAmber();
    }

    public void changeTrafficLightToGreen() {
        pedestrianCrossingLight.changeToRed();
        trafficLight.changeToGreen();
    }

}
