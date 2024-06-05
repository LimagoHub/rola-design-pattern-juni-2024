package main;

import composite.AbstractKontoNode;
import composite.Konto;
import composite.KontoGruppe;
import composite.visitors.KontogruppeSaldenVisitor;
import composite.visitors.PrintVisitor;
import composite.visitors.WeltspartagVisitor;

public class Main {
    public static void main(String[] args) {

        KontoGruppe bank = new KontoGruppe("bank");

        KontoGruppe festgeld = new KontoGruppe("festgeld");
        KontoGruppe tagesgeld = new KontoGruppe("tagesgeld");
        KontoGruppe giro = new KontoGruppe("giro");

        bank.addChild(festgeld);
        bank.addChild(tagesgeld);
        bank.addChild(giro);


        KontoGruppe kinder = new KontoGruppe("kinder");
        festgeld.addChild(kinder);

        KontoGruppe alterssicherung = new KontoGruppe("alterssicherung");
        festgeld.addChild(alterssicherung);

        Konto k1234 = new Konto("k1234");
        tagesgeld.addChild(k1234);

        Konto k9876 = new Konto("k9876");
        tagesgeld.addChild(k9876);

        Konto giro1234 = new Konto("giro1234", 50);
        giro.addChild(giro1234);

        Konto giro9876 = new Konto("giro9876", 100);
        giro.addChild(giro9876);


        //bank.print();
        //traverse(bank);

        /*for(var myNode: bank){
            System.out.println(myNode);
        }*/

        bank.iterate(new PrintVisitor());
        giro.iterate(new KontogruppeSaldenVisitor());
        bank.iterate(new WeltspartagVisitor());
        bank.iterate(new PrintVisitor());
    }

    private static void traverse(AbstractKontoNode node) {
        System.out.println(node);
        for(var child: node.getChildren()){
            traverse(child);
        }
    }
}