package tiere;

import java.util.*;

public class Schwein {

    public static final int MAX_WEIGHT = 20;
    private List<PigTooFatListener> pigTooFatListeners = new ArrayList<>();


    private String name;
    private int gewicht;

    public Schwein() {
        this("nobody");
    }

    public Schwein(String name) {
        this.name = name;
        this.gewicht = 10;
    }

    public void addPigTooFatListener(PigTooFatListener listener){
        pigTooFatListeners.add(listener);
    }

    public void removePigTooFatListener(PigTooFatListener listener){
        pigTooFatListeners.remove(listener);
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
        if(gewicht >= MAX_WEIGHT) firePigTooFatEvent();
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

    private void firePigTooFatEvent() {
        pigTooFatListeners.forEach(listener->listener.pigTooFat(this));
    }
}
