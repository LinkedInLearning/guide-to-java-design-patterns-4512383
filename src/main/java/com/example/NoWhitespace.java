package com.example;

public class NoWhitespace implements Expression {

    @Override
    public String interpret(String context) {
        return context.replaceAll("\\s+", "");
    }

}
