package com.example;

public class App {

    public static void main(String[] args) {

        var board = new Board();
        var ticket = new Ticket(board);
        var assignee = new Assignee();

        assignee.pickUpTicket(ticket);
        assignee.resolveTicket(ticket);


    }

}
