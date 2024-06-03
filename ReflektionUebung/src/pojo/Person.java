package pojo;

import java.io.Serializable;
import java.util.Set;

public class Person implements Serializable {

    private String vorname="John";
    private String nachname="Doe";

    public Person() {
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
