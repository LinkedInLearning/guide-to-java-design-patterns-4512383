package com.example;

import java.util.ArrayList;
import java.util.List;

public class Checklist {

    List<TodoItem> todoItems = new ArrayList<>();

    public void addTodoItem(TodoItem todoItem) {
        todoItems.add(todoItem);
    }

}
