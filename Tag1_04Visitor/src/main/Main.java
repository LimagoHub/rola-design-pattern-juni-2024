package main;

import firma.Firma;
import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfänger;
import mitarbeiter.visitors.PrintVisitor;
import mitarbeiter.visitors.ResetArbeitszeitVisitor;
import mitarbeiter.visitors.StatistikVisitor;

public class Main {
    public static void main(String[] args) {
       Firma firma = new Firma();
       firma.add(new Gehaltsempfaenger("Hinz", 2000));
       firma.add(new Lohnempfänger("Schmitt", 10,12));
       firma.add(new Lohnempfänger("Schulz", 10,40));
       firma.add(new Lohnempfänger("Meier", 10,40));
       firma.add(new Gehaltsempfaenger("Kunz", 3000));

       //firma.print();
        firma.iterate(new PrintVisitor());
        firma.iterate(new ResetArbeitszeitVisitor());
        firma.iterate(new PrintVisitor());
        firma.iterate(new StatistikVisitor());
    }
}

