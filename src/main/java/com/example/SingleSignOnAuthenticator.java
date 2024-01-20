package com.example;

public class SingleSignOnAuthenticator implements Authenticator {

    @Override
    public void logIn() {
        System.out.println("Logging in with single sign-on.");
    }

}
