package com.example;

import java.util.ArrayList;
import java.util.List;

public class Newsfeed {

    private List<String> statuses = new ArrayList<>();

    public void printStatuses() {
        statuses.forEach(System.out::println);
    }

}
