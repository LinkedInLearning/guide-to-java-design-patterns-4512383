package com.example;

import java.util.List;

public class OrderTracker {

    public static void main(String[] args) {

        Meal hawaiianPizza1 = new Pizza(4, "Hawaiian");
        Meal hawaiianPizza2 = hawaiianPizza1.clone();
        Meal hawaiianPizza3 = hawaiianPizza1.clone();;
        Meal hawaiianPizza4 = hawaiianPizza1.clone();
        Meal hawaiianPizza5 = hawaiianPizza1.clone();

        Meal pepperoniPizza1 = new Pizza(5, "Pepperoni");
        Meal pepperoniPizza2 = pepperoniPizza1.clone();
        Meal pepperoniPizza3 = pepperoniPizza1.clone();
        Meal pepperoniPizza4 = pepperoniPizza1.clone();
        Meal pepperoniPizza5 = pepperoniPizza1.clone();

        List<Meal> order = List.of(hawaiianPizza1, hawaiianPizza2, hawaiianPizza3, hawaiianPizza4, hawaiianPizza5,
                pepperoniPizza1, pepperoniPizza2, pepperoniPizza3, pepperoniPizza4, pepperoniPizza5);

        placeOrder(order);

    }

    private static void placeOrder(List<Meal> meals) {
        System.out.println("Order placed: " );
        meals.forEach(System.out::println);
    }

}
