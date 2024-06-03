package mitarbeiter;

import mitarbeiter.visitors.MitarbeiterVisitor;

public abstract class AbstractMitarbeiter {

    private String name;


    public AbstractMitarbeiter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }





    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name  ;
    }

    public abstract void accept(MitarbeiterVisitor visitor) ;
}
