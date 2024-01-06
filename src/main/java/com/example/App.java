package com.example;

public class App {

    public static void main(String[] args) {
        var light = new Light();
        light.isOn();
        var lightCommandExecutor = new LightCommandExecutor();
        lightCommandExecutor.execute(new TurnOnLightCommand(light));
        light.isOn();
        lightCommandExecutor.execute(new TurnOffLightCommand(light));
        light.isOn();
    }

}
