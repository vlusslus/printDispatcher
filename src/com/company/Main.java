package com.company;

public class Main {

    public static void main(String[] args) {

        Dispatcher dispatcher = new Dispatcher();

        dispatcher.accept(new Document(10));
        dispatcher.accept(new Document(3));
        dispatcher.accept(new Document(5));

        dispatcher.accept(new Document(7));



    }
}
