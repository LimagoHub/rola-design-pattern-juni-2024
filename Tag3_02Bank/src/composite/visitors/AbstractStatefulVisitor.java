package composite.visitors;

import composite.Konto;
import composite.KontoGruppe;

public abstract class AbstractStatefulVisitor implements KontoVisitor {
    @Override
    public void visit(KontoGruppe kontoGruppe) {

    }

    @Override
    public void visit(Konto konto) {

    }
}
