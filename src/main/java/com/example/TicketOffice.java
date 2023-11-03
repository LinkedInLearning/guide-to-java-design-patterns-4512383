package com.example;

public class TicketOffice {

    private static final TicketMachine ticketMachine = new TicketMachine();


    public static void main(String[] args) {
        buyABusTicket();
    }

    private static void buyABusTicket() {
        var ticket = ticketMachine.createTicket();
        System.out.println("One bus ticket purchased. The price is $" + ticket.getPrice() + ".");
    }

}
