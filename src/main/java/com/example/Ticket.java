package com.example;

public class Ticket {


  private Assignee assignee;
    public enum Status {
        SUBMITTED,
        IN_PROGRESS,
        DONE
    }

    private Status status;

    public Ticket() {
        this.status = Status.SUBMITTED;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
        System.out.println("Ticket status changed to " + status);
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

}
