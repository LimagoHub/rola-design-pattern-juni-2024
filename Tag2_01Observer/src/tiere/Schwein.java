package tiere;

import events.PropertyChangedEvent;
import events.PropertyChangedListener;

import java.util.*;

public class Schwein {

    public static final int MAX_WEIGHT = 20;
    private List<PigTooFatListener> pigTooFatListeners = new ArrayList<>();

    private List<PropertyChangedListener> propertyChangedListeners = new ArrayList<>();

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

    public void addPropertyChangedListener(PropertyChangedListener propertyChangedListener){
        propertyChangedListeners.add(propertyChangedListener);
    }

    public void removePropertyChangedListener(PropertyChangedListener propertyChangedListener){
        propertyChangedListeners.remove(propertyChangedListener);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(this.name == name) return;
        firePropertyChanged("name", this.name, this.name = name);
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(int gewicht) {
        firePropertyChanged("gewicht", this.gewicht, this.gewicht = gewicht);
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

    private void firePropertyChanged(String propertyName, Object oldValue, Object newValue) {
        PropertyChangedEvent propertyChangedEvent = new PropertyChangedEvent(this, propertyName,oldValue,newValue);
        firePropertyChanged(propertyChangedEvent);
    }

    private void firePropertyChanged(PropertyChangedEvent event) {

        propertyChangedListeners.forEach(listener->listener.propertyChanged(event));
    }
}
