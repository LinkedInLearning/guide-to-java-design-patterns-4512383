package com.example;

public class App {

    public static void main(String[] args) {
        Checklist checklist = new Checklist();
        var todoItem1 = new TodoItem("Do this");
        var todoItem2 = new TodoItem("Do that");
        var todoItem3 = new TodoItem("Do something else");

        checklist.addTodoItem(todoItem1);
        checklist.addTodoItem(todoItem2);
        checklist.addTodoItem(todoItem3);

        todoItem1.complete();

        checklist.isCompleted();
    }

}
