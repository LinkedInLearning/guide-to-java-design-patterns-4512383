package com.example;

public class ConsoleLogger extends Logger {

    @Override
    public void log(LoggerRequest request) {
        System.out.println(request.getMessage());
    }


}
