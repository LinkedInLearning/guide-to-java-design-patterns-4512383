package com.example;

public class App {

    public static void main(String[] args) {

        var fileSystem = new FileSystem();
        var directory1 = new Directory("Directory 1");
        var directory2 = new Directory("Directory 2");
        var file1 = new File("File 1", 100);
        var file2 = new File("File 2", 200);

        directory1.addElement(file1);
        directory2.addElement(file2);
        directory1.addElement(directory2);

        fileSystem.addElement(directory1);

    }

}
