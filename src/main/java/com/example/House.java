package com.example;

public class House {

    public static void main(String[] args) {

        var room = new BasicRoom();
        room.printFurniture();

        System.out.println();

        // create a room with a carpet and a couch
        var roomWithTable = new RoomWithTable(room);
        roomWithTable.printFurniture();

        System.out.println();

        // create a room with carpet, a couch and a table
        var roomWithTableAndCouch = new RoomWithCouch(roomWithTable);
        roomWithTableAndCouch.printFurniture();

    }

}
