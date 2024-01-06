package com.example;

public class Light {

    private boolean isOn = false;



    public void turnOnLight() {
        isOn = true;
    }

    public void turnOffLight() {
        isOn = false;
    }

    public void isOn() {
        System.out.println("Light is " + (isOn ? "on" : "off") + ".");
    }

}
