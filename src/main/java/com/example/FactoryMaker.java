package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {

    private static final Map<String, Supplier<UserInterfaceFactory>> userInterfaceFactories = new HashMap<>();

    static {
        userInterfaceFactories.put("BLUE", BlueUserInterfaceFactory::new);
        userInterfaceFactories.put("RED", RedUserInterfaceFactory::new);
    }

    public static UserInterfaceFactory createFactory(String color) {
        if (userInterfaceFactories.get(color) != null) {
            return userInterfaceFactories.get(color).get();
        } else {
            throw new IllegalArgumentException("Color not supported");
        }
    }

}
