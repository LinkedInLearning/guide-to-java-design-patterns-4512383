package com.example;

public class TodoItem implements Completable {

    private final String description;
    private boolean completed = false;

    public TodoItem(String description) {
        this.description = description;
    }

    @Override
    public void isCompleted() {
        System.out.println("Todo item \"" + description + "\" is completed: " + completed);
    }

    public void complete() {
        completed = true;
    }

}
