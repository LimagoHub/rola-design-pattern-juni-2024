package main;

import events.PropertyChangedEvent;
import events.PropertyChangedListener;
import tiere.PigTooFatListener;
import tiere.Schwein;

import java.util.Observer;

public class Main implements PropertyChangedListener {
    private Metzger metzger = new Metzger();
    private Spediteur spediteur = new Spediteur();
    public static void main(String[] args) {
       new Main().run();
    }
    private void run() {
        Schwein piggy = new Schwein("Miss Piggy");
        piggy.addPigTooFatListener(new SchweineMetzgerAdapter());
        piggy.addPigTooFatListener(source->spediteur.fahren(source));
        piggy.addPigTooFatListener(spediteur::fahren);
        piggy.addPropertyChangedListener(this);

        for (int i = 0; i < 11; i++) {
            piggy.fuettern();
        }
    }

    @Override
    public void propertyChanged(PropertyChangedEvent propertyChangedEvent) {
        System.out.println(propertyChangedEvent);
    }

    class SchweineMetzgerAdapter implements PigTooFatListener {

        @Override
        public void pigTooFat(Schwein source) {
            metzger.schlachten(source);
        }
    }
}
class Metzger  {

    public void schlachten(Object source) {
        System.out.println("Messer wetz!");
    }
}

class Spediteur {
    public void fahren(Object ware) {
        System.out.println("Wir fahren auf der Autobahn");
    }
}