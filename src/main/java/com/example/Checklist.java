package com.example;

import java.util.ArrayList;
import java.util.List;

public class Checklist implements Completable {

    List<TodoItem> todoItemItems = new ArrayList<>();

    public void addTodoItem(TodoItem todoItem) {
        todoItemItems.add(todoItem);
    }

    @Override
    public void isCompleted() {
        todoItemItems.forEach(TodoItem::isCompleted);
    }

}
