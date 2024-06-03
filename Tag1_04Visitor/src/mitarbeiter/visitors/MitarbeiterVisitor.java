package mitarbeiter.visitors;

import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfänger;

public interface MitarbeiterVisitor {

    void init();
    void visit(Gehaltsempfaenger gehaltsempfaenger);
    void visit(Lohnempfänger lohnempfänger);
    void dispose();
}
