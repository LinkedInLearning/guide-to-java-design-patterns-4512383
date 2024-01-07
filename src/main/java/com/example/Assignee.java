package com.example;

import java.util.ArrayList;
import java.util.List;

public class Assignee {

    private List<Ticket> tickets = new ArrayList<>();

    public List<Ticket> getTickets() {
        return this.tickets;
    }

    public void pickUpTicket(Ticket ticket) {
        tickets.add(ticket);
        ticket.setAssignee(this);
        ticket.setStatus(Ticket.Status.IN_PROGRESS);
        var board = ticket.getBoard();
        board.addTicketToInProgressTickets(ticket);
        System.out.println("Ticket picked up by assignee");
    }

    public void resolveTicket(Ticket ticket) {
        ticket.setStatus(Ticket.Status.DONE);
        tickets.remove(ticket);
        var board = ticket.getBoard();
        board.addTicketToDoneTickets(ticket);
        System.out.println("Ticket resolved");
    }

}
