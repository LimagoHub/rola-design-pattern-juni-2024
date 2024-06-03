package main;

import business.BusinessObject;

public class Main {
    public static void main(String[] args) {

        BusinessObject businessObject = new BusinessObject();

        businessObject.print();
        businessObject.changeToB();
        businessObject.print();
        businessObject.changeToB();
    }
}