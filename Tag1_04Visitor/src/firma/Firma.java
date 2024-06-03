package firma;

import mitarbeiter.AbstractMitarbeiter;
import mitarbeiter.visitors.MitarbeiterVisitor;

import java.util.ArrayList;
import java.util.List;

public class Firma {

    private List<AbstractMitarbeiter> mitarbeiters = new ArrayList<>();

    public boolean add(AbstractMitarbeiter abstractMitarbeiter) {
        return mitarbeiters.add(abstractMitarbeiter);
    }

    public boolean remove(AbstractMitarbeiter abstractMitarbeiter) {
        return mitarbeiters.remove(abstractMitarbeiter);
    }


    public void iterate(MitarbeiterVisitor visitor) {

       visitor.init();
        /*for (AbstractMitarbeiter mitarbeiter : mitarbeiters) {
            //visitor.visit(mitarbeiter);
            mitarbeiter.accept(visitor);
        }*/
        mitarbeiters.forEach(m->m.accept(visitor));

        visitor.dispose();
    }
}
