package com.example;

public class App {

    public static void main(String[] args) {
        var doReMe = new Song();
        var a = new Note('A');
        var b = new Note('B');
        var c = new Note('C');
        var d = new Note('D');
        var e = new Note('E');
        var f = new Note('F');
        var g = new Note('G');

        doReMe.addNote(c);
        doReMe.addNote(d);
        doReMe.addNote(e);
        doReMe.addNote(c);
        doReMe.addNote(e);
        doReMe.addNote(c);
        doReMe.addNote(e);

        doReMe.getNotes().get(0).play();
        doReMe.getNotes().get(1).play();
        doReMe.getNotes().get(2).play();
        doReMe.getNotes().get(3).play();
        doReMe.getNotes().get(4).play();
        doReMe.getNotes().get(5).play();
        doReMe.getNotes().get(6).play();

    }

}
