package composite.visitors;

import composite.Konto;

public class WeltspartagVisitor extends AbstractKontoVisitor{

    @Override
    public void visit(Konto konto) {
        konto.setSaldo(konto.getSaldo() + 5);
    }
}
