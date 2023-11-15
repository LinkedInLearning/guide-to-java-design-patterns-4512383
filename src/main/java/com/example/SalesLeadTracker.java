package com.example;

import java.time.LocalDate;

public class SalesLeadTracker {

    public static void main(String[] args) {

        var person1 = new Person.PersonBuilder("Tracy", "Westbay")
                .dateOfBirth(LocalDate.of(1985, 1, 1))
                .emailAddress("tracy@example.com")
                .build();

        addPersonToLeadTracker(person1);

        var person2 = new Person.PersonBuilder("Jerome", "Donaldson")
                .middleName("Henry")
                .phoneNumber("123456789")
                .build();

        addPersonToLeadTracker(person2);
    }

    private static void addPersonToLeadTracker(Person person) {
        System.out.println("A new lead was added to the lead tracker: \n" + person);
    }

}
