package com.example;

import java.time.LocalDate;

public class SalesLeadTracker {

    public static void main(String[] args) {

        var person1 = new Person("Tracy", null, "Westbay",
                LocalDate.of(1985,1, 1), "tracy@example.com",
                null, "123456789");

        addToLeadTracker(person1);

        var person2 = new Person("Jerome", "Henry", "Donaldson",
                LocalDate.of(1999,2, 2), null,
                "1 Sunny Street", null);

        addToLeadTracker(person2);
    }

    private static void addToLeadTracker(Person person) {
        System.out.println("A new lead was added to the lead tracker: \n" + person);
    }

}
