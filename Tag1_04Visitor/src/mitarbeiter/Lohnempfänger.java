package mitarbeiter;

import mitarbeiter.visitors.MitarbeiterVisitor;

public class Lohnempfänger extends  AbstractMitarbeiter{

    private double stundenlohn = 0;
    private double arbeitszeit = 0;


    public Lohnempfänger(String name) {
        super(name);
    }

    public Lohnempfänger(String name, double stundenlohn, double arbeitszeit) {
        super(name);
        this.stundenlohn = stundenlohn;
        this.arbeitszeit = arbeitszeit;
    }

    public double getStundenlohn() {
        return stundenlohn;
    }

    public void setStundenlohn(double stundenlohn) {
        this.stundenlohn = stundenlohn;
    }

    public double getArbeitszeit() {
        return arbeitszeit;
    }

    public void setArbeitszeit(double arbeitszeit) {
        this.arbeitszeit = arbeitszeit;
    }

    @Override
    public String toString() {
        return  super.toString()  +
                "stundenlohn=" + stundenlohn +
                ", arbeitszeit=" + arbeitszeit +
                "} " ;
    }

    @Override
    public void accept(MitarbeiterVisitor visitor) {
        visitor.visit(this);
    }
}
