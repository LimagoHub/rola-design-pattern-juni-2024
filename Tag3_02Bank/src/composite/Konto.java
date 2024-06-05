package composite;


import composite.visitors.KontoVisitor;

public class Konto extends AbstractKontoNode {

    private double saldo=0;
    public Konto(String label) {
        super(label);
    }

    public Konto(String label, double saldo) {
        super(label);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Konto{");
        sb.append("label=").append(getLabel());
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void accept(KontoVisitor visitor) {
        visitor.visit(this);
    }
}
