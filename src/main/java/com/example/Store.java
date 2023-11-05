package com.example;

public class Store {

    private static final VendingMachine VENDING_MACHINE = new VendingMachine();


    public static void main(String[] args) {
        buySnack("ChocolateBar");
        buySnack("Chips");
        buySnack("Drink");
    }

    private static void buySnack(String snackType) {
        Snack snack = VENDING_MACHINE.getSnack(snackType);
        System.out.println("One " + snackType + " purchased. The price is $" + snack.getPrice() + ".");
    }

}
