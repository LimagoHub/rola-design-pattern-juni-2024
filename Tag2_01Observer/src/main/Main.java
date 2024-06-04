package main;

import tiere.PigTooFatListener;
import tiere.Schwein;

public class Main {
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
        for (int i = 0; i < 11; i++) {
            piggy.fuettern();
        }
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