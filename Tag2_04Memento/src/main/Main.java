package main;

import tiere.Schwein;
import tiere.SchweineMemento;

public class Main {
    public static void main(String[] args) {

        Schwein piggy = new Schwein("Miss Piggy");
        System.out.println(piggy);

        SchweineMemento memento = piggy.getMemento();

        piggy.fuettern();

        System.out.println(piggy);
        piggy.setMemento(memento);
        System.out.println(piggy);



    }
}