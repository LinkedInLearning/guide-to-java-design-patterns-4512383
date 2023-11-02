package com.example;

import java.util.List;

public class OrderTracker {

    public static void main(String[] args) {

        Pizza hawaiianPizza1 = new Pizza(4, "Hawaiian");
        Pizza hawaiianPizza2 = new Pizza(4, "Hawaiian");
        Pizza hawaiianPizza3 = new Pizza(4, "Hawaiian");
        Pizza hawaiianPizza4 = new Pizza(4, "Hawaiian");
        Pizza hawaiianPizza5 = new Pizza(4, "Hawaiian");

        Pizza pepperoniPizza1 = new Pizza(5, "Pepperoni");
        Pizza pepperoniPizza2 = new Pizza(5, "Pepperoni");
        Pizza pepperoniPizza3 = new Pizza(5, "Pepperoni");
        Pizza pepperoniPizza4 = new Pizza(5, "Pepperoni");
        Pizza pepperoniPizza5 = new Pizza(5, "Pepperoni");

        List<Meal> order = List.of(hawaiianPizza1, hawaiianPizza2, hawaiianPizza3, hawaiianPizza4, hawaiianPizza5,
                pepperoniPizza1, pepperoniPizza2, pepperoniPizza3, pepperoniPizza4, pepperoniPizza5);

        placeOrder(order);

    }

    private static void placeOrder(List<Meal> meals) {
        System.out.println("Order placed: " + meals);
    }

}
