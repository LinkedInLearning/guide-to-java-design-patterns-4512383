package com.example;

public class App {

    public static void main(String[] args) {

        var pizza1 = new Order("Pizza");
        var pizza2 = new Order("Pizza");
        var pizza3 = new Order("Pizza");
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);

        var burger1 = new Order("Burger");
        var burger2 = new Order("Burger");
        var burger3 = new Order("Burger");
        System.out.println(burger1);
        System.out.println(burger2);
        System.out.println(burger3);

    }

}
