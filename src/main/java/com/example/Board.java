package com.example;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Ticket> inProgressTickets = new ArrayList<>();
    private List<Ticket> doneTickets = new ArrayList<>();

    public List<Ticket> getDoneTickets() {
        return this.doneTickets;
    }

    public void addTicketToInProgressTickets(Ticket ticket) {
        inProgressTickets.add(ticket);
        ticket.setStatus(Ticket.Status.IN_PROGRESS);
        System.out.println("Ticket added to inProgressTickets");
    }

    public void addTicketToDoneTickets(Ticket ticket) {
        ticket.setStatus(Ticket.Status.DONE);
        doneTickets.add(ticket);
        System.out.println("Ticket added to doneTickets");
        inProgressTickets.remove(ticket);
        System.out.println("Ticket removed from inProgressTickets");
    }


}
