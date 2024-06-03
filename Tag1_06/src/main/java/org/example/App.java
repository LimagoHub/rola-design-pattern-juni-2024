package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person john = Person
                .builder()
                .anrede("Herr")
                .vorname("John")
                .nachname("Doe")
                .build();

        System.out.println( "Hello World!" );
    }
}
