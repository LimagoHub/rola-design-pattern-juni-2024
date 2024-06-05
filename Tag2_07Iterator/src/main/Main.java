package main;

import iterators.ConsoleIterator;

public class Main {
    public static void main(String[] args) {

        ConsoleIterator it = new ConsoleIterator();

        while(it.hasNext())
            System.out.println(it.next());
        //System.out.println("Hello world!");
    }
}