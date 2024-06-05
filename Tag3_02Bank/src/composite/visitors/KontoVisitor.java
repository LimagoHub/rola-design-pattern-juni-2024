package composite.visitors;

import composite.Konto;
import composite.KontoGruppe;

public interface KontoVisitor {

    void init();
    void dispose();
    void visit (KontoGruppe kontoGruppe);
    void visit (Konto konto);

}
