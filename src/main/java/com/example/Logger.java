package com.example;

public enum Logger {

    INSTANCE;

    private Logger() {}

    public static Logger getInstance() {
        return INSTANCE;
    }

    void log(String logMessage) {
        System.out.println(logMessage);
    }

}
