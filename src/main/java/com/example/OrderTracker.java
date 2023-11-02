package com.example;

import java.util.List;

public class OrderTracker {

    public static void main(String[] args) {

        PizzaFlavour hawaiian = new PizzaFlavour("Hawaiian");
        Pizza hawaiianPizza1 = new Pizza(4, hawaiian);
        Pizza hawaiianPizza2 = new Pizza(4, hawaiian);
        Pizza hawaiianPizza3 = new Pizza(4, hawaiian);
        Pizza hawaiianPizza4 = new Pizza(4, hawaiian);
        Pizza hawaiianPizza5 = new Pizza(4, hawaiian);


        PizzaFlavour pepperoni = new PizzaFlavour("Pepperoni");
        Pizza pepperoniPizza1 = new Pizza(5, pepperoni);
        Pizza pepperoniPizza2 = new Pizza(5, pepperoni);
        Pizza pepperoniPizza3 = new Pizza(5, pepperoni);
        Pizza pepperoniPizza4 = new Pizza(5, pepperoni);
        Pizza pepperoniPizza5 = new Pizza(5, pepperoni);

        List<Meal> order = List.of(hawaiianPizza1, hawaiianPizza2, hawaiianPizza3, hawaiianPizza4, hawaiianPizza5,
                pepperoniPizza1, pepperoniPizza2, pepperoniPizza3, pepperoniPizza4, pepperoniPizza5);

        placeOrder(order);

    }

    private static void placeOrder(List<Meal> meals) {
        System.out.println("Order placed: " );
        meals.forEach(System.out::println);
    }

}
