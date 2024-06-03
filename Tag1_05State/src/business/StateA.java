package business;

public class StateA extends  AbstractState{

    public StateA(BusinessObject businessObject) {
        super(businessObject);
    }

    @Override
    public void changeToB() {
        getBusinessObject().current = getBusinessObject().stateB;
    }

    @Override
    public void print() {
        System.out.println("Hier druckt A");
    }
}
