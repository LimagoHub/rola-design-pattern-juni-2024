package mitarbeiter;

import mitarbeiter.visitors.MitarbeiterVisitor;

public class Gehaltsempfaenger extends AbstractMitarbeiter{

    private double gehalt;

    public Gehaltsempfaenger(String name) {
        super(name);
    }

    public Gehaltsempfaenger(String name, double gehalt) {
        super(name);
        this.gehalt = gehalt;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "gehalt=" + gehalt +
                "} " ;
    }

    @Override
    public void accept(MitarbeiterVisitor visitor) {
        visitor.visit(this);
    }
}
