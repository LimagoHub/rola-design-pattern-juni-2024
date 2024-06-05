package composite.visitors;

import composite.Konto;

public class ZinsVisitor extends AbstractKontoVisitor{

    private final double zinssatz;

    public ZinsVisitor(double zinssatz) {
        this.zinssatz = zinssatz;
    }

    @Override
    public void visit(Konto konto) {
        konto.setSaldo(konto.getSaldo() * zinssatz);
    }
}
