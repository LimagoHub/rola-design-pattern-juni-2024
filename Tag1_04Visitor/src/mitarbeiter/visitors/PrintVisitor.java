package mitarbeiter.visitors;

import mitarbeiter.AbstractMitarbeiter;
import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfänger;

public class PrintVisitor extends AbstractMitarbeiterVisitor{
    @Override
    public void visit(Gehaltsempfaenger gehaltsempfaenger) {
        System.out.println(gehaltsempfaenger);
    }

    @Override
    public void visit(Lohnempfänger lohnempfänger) {
        System.out.println(lohnempfänger);
    }
}
