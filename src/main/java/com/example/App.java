package com.example;

public class App {

    public static void main(String[] args) {
        var groupTicket = new GroupTicket();
        var ticket1 = new AdultTicket();
        var ticket2 = new AdultTicket();
        groupTicket.addElement(ticket1);
        groupTicket.addElement(ticket2);

        System.out.println("Price: " + groupTicket.getPrice());

//        var discountVisitor = new DiscountVisitor();
//        groupTicket.accept(discountVisitor);
//
//        System.out.println("Price: " + groupTicket.getPrice());
    }

}
