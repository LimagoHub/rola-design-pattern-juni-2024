package business;

public class StateB extends AbstractState{
    public StateB(BusinessObject businessObject) {
        super(businessObject);
    }

    @Override
    public void changeToA() {
        getBusinessObject().current = getBusinessObject().stateA;
    }

    @Override
    public void print() {
        System.out.println("Hier druckt B");
    }
}
