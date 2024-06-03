package mitarbeiter.visitors;

import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfänger;

public class AbstractMitarbeiterVisitor implements MitarbeiterVisitor {
    @Override
    public void visit(Gehaltsempfaenger gehaltsempfaenger) {
        // OK
    }

    @Override
    public void visit(Lohnempfänger lohnempfänger) {
        // OK
    }

    @Override
    public void init() {

    }

    @Override
    public void dispose() {

    }
}
