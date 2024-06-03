package business;

public class BusinessObject {

    /* default */ final State stateA = new StateA(this);
    /* default */ final State stateB = new StateB(this);
    /* default */ State current = stateA;

    public void changeToA() {
        current.changeToA();
    }

    public void changeToB() {
        current.changeToB();
    }

    public void print() {
        current.print();
    }
}
