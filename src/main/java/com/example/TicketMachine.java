package com.example;

public class TicketMachine {

    Ticket createTicket() {
        return new BusTicket();
    }


}
