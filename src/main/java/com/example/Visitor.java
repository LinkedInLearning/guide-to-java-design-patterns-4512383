package com.example;

public interface Visitor {

    void visit(AdultTicket ticket);
    void visit(GroupTicket ticket);

}
