package com.example;

public class App {

    public static void main(String[] args) {

        var logInPage = new LogInPage();

        logInPage.logIn(new PasswordAuthenticator());
        logInPage.logIn(new SingleSignOnAuthenticator());

    }

}
