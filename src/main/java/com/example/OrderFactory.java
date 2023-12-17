package com.example;

import java.util.HashMap;
import java.util.Map;

public class OrderFactory {

    private static final Map<String, Order> orderCache = new HashMap<>();

    public static Order createOrder(String name) {

        return orderCache.computeIfAbsent(name, Order::new);

    }


}
