package composite.visitors;

import composite.AbstractKontoNode;
import composite.Konto;
import composite.KontoGruppe;

public class PrintVisitor extends AbstractStatelessVisitor {



    @Override
    public void visit(KontoGruppe kontoGruppe) {
        print(kontoGruppe);
    }

    @Override
    public void visit(Konto konto) {
        print(konto);
    }

    private void print(AbstractKontoNode node){
        System.out.println(node);
    }
}
