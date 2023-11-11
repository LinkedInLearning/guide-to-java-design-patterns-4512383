package com.example;

public class App {


    public static void main(String[] args) {
        UserInterface roadUserInterface = createUserInterface("RED");
        UserInterface mountainUserInterface = createUserInterface("BLUE");

        System.out.println(roadUserInterface);
        System.out.println(mountainUserInterface);

    }


    private static UserInterface createUserInterface(String color) {
        var userInterfaceFactory = FactoryMaker.createFactory(color);
        var button = userInterfaceFactory.createButton();
        var scrollBar = userInterfaceFactory.createScrollbar();
        return new UserInterface(button, scrollBar);
    }

}

