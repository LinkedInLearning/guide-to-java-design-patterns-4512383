package com.example;

public interface Authenticator {
    void logIn();

    Authenticator passwordAuthenticator = () -> System.out.println("Logging in with username and password.");
    Authenticator singleSignOnAuthenticator = () -> System.out.println("Logging in with single sign-on.");

}
