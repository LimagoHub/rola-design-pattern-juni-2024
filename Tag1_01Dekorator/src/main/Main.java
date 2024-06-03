package main;

import client.CalcClient;
import math.*;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        Instant start = Instant.now();

        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);

        System.out.println(duration.toMillis());


        CalculatorFactory.setLogger(true);
        CalculatorFactory.setSecure(false);
        Calculator calculator = CalculatorFactory.create();
        CalcClient calcClient = new CalcClient(calculator);
        calcClient.go();


    }
}