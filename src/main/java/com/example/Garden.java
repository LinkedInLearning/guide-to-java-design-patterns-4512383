package com.example;

public class Garden {

    public static void main(String[] args) {

        var sunflower1 = FlowerFactory.createFlower("Sunflower");
        var sunflower2 = FlowerFactory.createFlower("Sunflower");
        var sunflower3 = FlowerFactory.createFlower("Sunflower");
        System.out.println(sunflower1);
        System.out.println(sunflower2);
        System.out.println(sunflower3);

        var rose1 = FlowerFactory.createFlower("Rose");
        var rose2 = FlowerFactory.createFlower("Rose");
        var rose3 = FlowerFactory.createFlower("Rose");
        System.out.println(rose1);
        System.out.println(rose2);
        System.out.println(rose3);

    }

}
