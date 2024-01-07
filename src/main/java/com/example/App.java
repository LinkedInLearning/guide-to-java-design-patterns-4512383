package com.example;

public class App {

    public static void main(String[] args) {

        var pen = new Item("Pen", 20);
        var pencil = new Item("Pencil", 0);
        var eraser = new Item("Eraser", 15);

        var inventory = new Inventory(pen, pencil, eraser);
        var stockIterator = inventory.iterator();

        while (stockIterator.hasNext()) {
            var item = stockIterator.next();
            System.out.println(item.getName());
        }

    }

}
