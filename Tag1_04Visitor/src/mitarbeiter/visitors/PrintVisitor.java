package mitarbeiter.visitors;

import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfänger;

public class PrintVisitor implements MitarbeiterVisitor{
    @Override
    public void visit(Gehaltsempfaenger gehaltsempfaenger) {
        System.out.println(gehaltsempfaenger);
    }

    @Override
    public void visit(Lohnempfänger lohnempfänger) {
        System.out.println(lohnempfänger);
    }
}
