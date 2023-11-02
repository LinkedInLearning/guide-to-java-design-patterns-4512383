package com.example;

import java.util.List;

public class OrderTracker {

    public static void main(String[] args) {

        PizzaFlavor hawaiianFlavor = new PizzaFlavor("Hawaiian");
        Pizza hawaiianPizza1 = new Pizza(4, hawaiianFlavor);
        Pizza hawaiianPizza2 = hawaiianPizza1.clone();
        Pizza hawaiianPizza3 = hawaiianPizza1.clone();
        Pizza hawaiianPizza4 = hawaiianPizza1.clone();
        Pizza hawaiianPizza5 = hawaiianPizza1.clone();
        hawaiianFlavor.setName("Hawaiian with extra cheese");

        PizzaFlavor pepperoni = new PizzaFlavor("Pepperoni");
        Pizza pepperoniPizza1 = new Pizza(5, pepperoni);
        Pizza pepperoniPizza2 = pepperoniPizza1.clone();
        Pizza pepperoniPizza3 = pepperoniPizza1.clone();
        Pizza pepperoniPizza4 = pepperoniPizza1.clone();
        Pizza pepperoniPizza5 = pepperoniPizza1.clone();

        List<Meal> order = List.of(hawaiianPizza1, hawaiianPizza2, hawaiianPizza3, hawaiianPizza4, hawaiianPizza5,
                pepperoniPizza1, pepperoniPizza2, pepperoniPizza3, pepperoniPizza4, pepperoniPizza5);

        placeOrder(order);

    }

    private static void placeOrder(List<Meal> meals) {
        System.out.println("Order placed: " );
        meals.forEach(System.out::println);
    }

}
