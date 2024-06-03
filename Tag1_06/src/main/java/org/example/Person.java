package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

    private String anrede;
    private String vorname;
    private String nachname;

    /*
    public static PersonBuilder builder(){
        return new PersonBuilder();
    }

    public static class PersonBuilder {

        private Person person = new Person();

        public PersonBuilder anrede(String anrede) {
            person.setAnrede(anrede);
            return this;
        }

        public PersonBuilder vorname(String vorname) {
            person.setVorname(vorname);
            return this;
        }

        public PersonBuilder nachname(String nachname) {
            person.setNachname(nachname);
            return this;
        }

        public Person build() {
            // Validierung
            return person;
        }

    }
*/
}
