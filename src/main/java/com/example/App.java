package com.example;

public class App {


    public static void main(String[] args) {
        UserInterface roadUserInterface = createUserInterface("RED");
        UserInterface mountainUserInterface = createUserInterface("BLUE");

        System.out.println(roadUserInterface);
        System.out.println(mountainUserInterface);

    }


    private static UserInterface createUserInterface(String color) {
        if (color.equalsIgnoreCase("RED")) {
            return new UserInterface(new RedButton(), new RedScrollBar());
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new UserInterface(new BlueButton(), new BlueScrollBar());
        } else {
            throw new IllegalArgumentException("Color not supported");
        }

    }

}

