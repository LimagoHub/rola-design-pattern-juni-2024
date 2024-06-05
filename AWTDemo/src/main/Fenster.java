package main;

import java.awt.*;
import java.awt.event.*;

public class Fenster extends Frame{
    public Fenster()  {

        setSize(500, 500);
        Button button = new Button("Click Me");
        button.addActionListener(e->print());
        add(button);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               beenden();
            }
        });
        setVisible(true);


    }

    private void beenden() {
        // Daten retten
        dispose();
    }

    private void print() {
        System.out.println("Button wurde gedrückt!");
    }

    public static void main(String[] args) {

        new Fenster();
    }


}