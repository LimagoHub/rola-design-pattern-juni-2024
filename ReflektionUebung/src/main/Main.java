package main;

import util.BeanCreator;

public class Main {
    public static void main(String[] args) {

        BeanCreator creator = new BeanCreator();
        System.out.println(creator.createAndFillBean("pojo.Person"));
    }
}