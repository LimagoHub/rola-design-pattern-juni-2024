package main;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        var liste = List.of ("A","B","C","D");

        for(var item : liste) {
            System.out.println(item);
        }

        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }

        Iterator<String> it = liste.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


        System.out.println("Hello world!");
    }
}