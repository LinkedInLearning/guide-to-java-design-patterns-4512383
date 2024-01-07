package com.example;

public class App {

    public static void main(String[] args) {

        var board = new Board();
        var ticket = new Ticket();
        var assignee = new Assignee();

        var mediator = new Mediator(ticket, assignee, board);
        mediator.pickUpTicket();
        System.out.println();
        mediator.resolveTicket();


    }

}
