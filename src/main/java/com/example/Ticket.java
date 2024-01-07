package com.example;

public class Ticket {


  private Assignee assignee;
    public enum Status {
        SUBMITTED,
        IN_PROGRESS,
        DONE
    }

    private Status status;

    private Board board;

    public Ticket(Board board) {
        this.board = board;
        this.status = Status.SUBMITTED;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
        System.out.println("Ticket status changed to " + status);
    }

    public Assignee getAssignee() {
        return this.assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    public Board getBoard() {
        return this.board;
    }
}
