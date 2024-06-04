package tiere;


import java.io.Serializable;
import java.util.List;

public class Schwein implements Serializable {

    public static final int MAX_WEIGHT = 20;


    
    private String name;
    private int gewicht;



    public Schwein() {
        this("nobody");
    }

    public Schwein(String name) {
        this.name = name;
        this.gewicht = 10;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {

         this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(int gewicht) {
         this.gewicht = gewicht;

    }

    public void fuettern() {
        setGewicht(getGewicht() + 1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }

    public SchweineMemento getMemento() {
        return new MySchweineMemento(name, gewicht);
    }

    public void setMemento(SchweineMemento memento) {
        MySchweineMemento inner = (MySchweineMemento)  memento;
        setName(inner.getName());
        setGewicht(inner.gewicht);
    }

    private static class MySchweineMemento implements SchweineMemento {
        private final String name;
        private final int gewicht;

        public MySchweineMemento(String name, int gewicht) {
            this.name = name;
            this.gewicht = gewicht;
        }

        public String getName() {
            return name;
        }
    }
}
