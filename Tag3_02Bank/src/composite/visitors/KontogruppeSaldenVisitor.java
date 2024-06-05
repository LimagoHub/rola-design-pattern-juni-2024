package composite.visitors;

import composite.Konto;

public class KontogruppeSaldenVisitor extends AbstractStatefulVisitor{

    private double saldo;

    @Override
    public void init() {
        saldo = 0;
    }

    @Override
    public void dispose() {
        System.out.println(saldo);
    }

    @Override
    public void visit(Konto konto) {
        saldo += konto.getSaldo();
    }

    public double getSaldo() {
        return saldo;
    }
}
