package com.example;

import java.util.HashMap;
import java.util.Map;

public class FlowerFactory {

    private static final Map<String, Flower> flowerCache = new HashMap<>();

    public static Flower createFlower(String name) {
        return flowerCache.computeIfAbsent(name, Flower::new);
    }

}
