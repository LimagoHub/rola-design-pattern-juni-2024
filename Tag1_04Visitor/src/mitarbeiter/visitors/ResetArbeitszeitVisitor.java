package mitarbeiter.visitors;

import mitarbeiter.Lohnempfänger;

public class ResetArbeitszeitVisitor extends AbstractMitarbeiterVisitor{

    @Override
    public void visit(Lohnempfänger lohnempfänger) {
        lohnempfänger.setArbeitszeit(0);
    }
}
