package main;

import tiere.Schwein;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{

        Class clazz;

        // erstens
        clazz = Schwein.class;

        // zweitens
        clazz = new Schwein().getClass();

        // Dritte
        clazz = Class.forName("tiere.Schwein");

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println("---------------------------");
        Method [] methods = clazz.getMethods();

        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }
        System.out.println("---------------------------");
        methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }
        System.out.println("---------------------------");
        Object object = clazz.getConstructor().newInstance();
        System.out.println(object);

        Method method = clazz.getMethod("fuettern");
        method.invoke(object);
        System.out.println(object);

        method = clazz.getDeclaredMethod("setGewicht", int.class);
        method.setAccessible(true);
        method.invoke(object, -10);
        System.out.println(object);



    }
}