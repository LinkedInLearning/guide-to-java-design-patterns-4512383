package com.example;

public class DiscountVisitor implements Visitor {

    public void visit(AdultTicket ticket) {
        ticket.setPrice(5);
    }

    public void visit(GroupTicket ticket) {
        ticket.getElements().forEach(element -> element.accept(this));
    }

}
