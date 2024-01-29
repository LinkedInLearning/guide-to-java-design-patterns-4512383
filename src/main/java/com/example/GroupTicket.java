package com.example;

import java.util.ArrayList;
import java.util.List;

public class GroupTicket implements TicketElement {

    private int price;
    private final List<TicketElement> elements = new ArrayList<>();

    public GroupTicket() {
    }

    @Override
    public int getPrice() {
        return elements.stream().mapToInt(TicketElement::getPrice).sum();
    }

    public void addElement(TicketElement element) {
        elements.add(element);
    }

    public List<TicketElement> getElements() {
        return elements;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
