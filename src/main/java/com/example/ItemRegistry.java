package com.example;

public class ItemRegistry {

    public static void main(String[] args) {

        var item1 = new StoreItem.StoreItemBuilder()
        .setName("Pretzel")
        .setPrice(2.0)
        .setShortDescription("A tasty snack")
        .setStockAvailable(7)
        .build();

        var item2 = new StoreItem.StoreItemBuilder()
                .setName("Soup")
                .setPrice(1.5)
                .setLongDescription(
                "A meal that you can warm up at home. It can come in different flavours including tomato, chicken, and vegetable")
                .setPackagingType("Can")
                .build();

        addToItemRegistry(item1);
        addToItemRegistry(item2);
    }

    private static void addToItemRegistry(StoreItem storeItem) {
        System.out.println("A new item was added to the registry: \n" + storeItem);
    }

}
