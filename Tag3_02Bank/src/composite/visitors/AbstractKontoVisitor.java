package composite.visitors;

import composite.Konto;
import composite.KontoGruppe;

public abstract class AbstractKontoVisitor implements KontoVisitor{
    @Override
    public void init() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void visit(KontoGruppe kontoGruppe) {

    }

    @Override
    public void visit(Konto konto) {

    }
}
