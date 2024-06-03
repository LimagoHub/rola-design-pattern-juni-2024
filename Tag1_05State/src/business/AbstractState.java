package business;

public class AbstractState implements State{

    private final BusinessObject businessObject;

    public AbstractState(BusinessObject businessObject) {
        this.businessObject = businessObject;
    }

    @Override
    public void changeToA() {
        throw new UnsupportedOperationException("Diese Operation macht hier keinen Sinn!");
    }

    @Override
    public void changeToB() {
        throw new UnsupportedOperationException("Diese Operation macht hier keinen Sinn!");
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Diese Operation macht hier keinen Sinn!");
    }

    public BusinessObject getBusinessObject() {
        return businessObject;
    }
}
