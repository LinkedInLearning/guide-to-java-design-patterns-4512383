package com.example;

public class App {

    public static void main(String[] args) {
        var circle = new Circle(new Red());
        circle.getType();
        circle.getColor().get();

        var square = new Square(new Blue());
        square.getType();
        square.getColor().get();
    }

}
