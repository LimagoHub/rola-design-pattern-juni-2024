package mitarbeiter.visitors;

import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfänger;

public class StatistikVisitor implements MitarbeiterVisitor{

    private int geCounter;
    private int leCounter;


    public int getGeCounter() {
        return geCounter;
    }

    public int getLeCounter() {
        return leCounter;
    }

    public int getTotalCounter() {
        return leCounter + geCounter;
    }

    @Override
    public String toString() {
        return "StatistikVisitor{" +
                "geCounter=" + geCounter +
                ", leCounter=" + leCounter +
                ", totalCounter=" + getTotalCounter() +
                '}';
    }

    @Override
    public void init() {
        geCounter = leCounter = 0;
    }

    @Override
    public void visit(Gehaltsempfaenger gehaltsempfaenger) {
        geCounter ++;
    }

    @Override
    public void visit(Lohnempfänger lohnempfänger) {
        leCounter ++;
    }

    @Override
    public void dispose() {
        System.out.println(this);
    }
}
