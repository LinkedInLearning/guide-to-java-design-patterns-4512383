package com.example;

public class App {

    public static void main(String[] args) {

        var vegetarianPizza = new VegetarianPizza();
        vegetarianPizza.makeBase();
        vegetarianPizza.addToppings();
        vegetarianPizza.cook();

        var meatFeastPizza = new MeatFeastPizza();
        meatFeastPizza.makeBase();
        meatFeastPizza.addToppings();
        meatFeastPizza.cook();

    }

}
