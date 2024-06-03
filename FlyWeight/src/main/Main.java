package main;

import flyweight.AttributedCharacter;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder();

        Instant start = Instant.now();
        for (int i = 0; i < 2_500_000; i++) {
            s.append("a");
        }
        String string =s.toString();
        Instant ende = Instant.now();
        Duration duration = Duration.between(start, ende);
        System.out.println(duration.toMillis());


    }
}