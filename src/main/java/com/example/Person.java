package com.example;

import java.time.LocalDate;

public class Person

{
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final LocalDate dateOfBirth;
    private final String emailAddress;
    private final String phoneNumber;

    private Person(PersonBuilder personBuilder) {
        this.firstName = personBuilder.firstName;
        this.middleName = personBuilder.middleName;
        this.lastName = personBuilder.lastName;
        this.dateOfBirth = personBuilder.dateOfBirth;
        this.emailAddress = personBuilder.emailAddress;
        this.phoneNumber = personBuilder.phoneNumber;
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("First name and last name must not be null");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static class PersonBuilder {

        private final String firstName;
        private String middleName;
        private final String lastName;
        private LocalDate dateOfBirth;
        private String emailAddress;
        private String phoneNumber;

        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public PersonBuilder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public PersonBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Person build() {
            return new Person(this);
        }


    }

}
