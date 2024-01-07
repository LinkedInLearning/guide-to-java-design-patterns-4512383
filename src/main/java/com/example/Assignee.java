package com.example;

import java.util.ArrayList;
import java.util.List;

public class Assignee {

    private List<Ticket> tickets = new ArrayList<>();

    public void pickUpTicket(Ticket ticket, Board board) {
        System.out.println("Ticket picked up by assignee");
        tickets.add(ticket);
        ticket.setAssignee(this);
        board.addTicketToInProgressTickets(ticket);
    }

    public void resolveTicket(Ticket ticket, Board board) {
        tickets.remove(ticket);
        board.addTicketToDoneTickets(ticket);
        System.out.println("Ticket resolved");
    }

}
