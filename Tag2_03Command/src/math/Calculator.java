package math;

public class Calculator {
    // Eager
    private static final Calculator instance = new Calculator();
    public static Calculator getInstance() {
        return instance;
    }
    private Calculator() {  }

    private double memory = 0;

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public void add(double value) {
        memory += value;
    }
    public void sub(double value) {
        memory -= value;
    }
    public void mul(double value) {
        memory *= value;
    }
    public void div(double value) {
        memory /= value;
    }

    public void print() {
        System.out.println(memory);
    }

    public void clear() {
        memory = 0;
    }


}
