package command;

import math.Calculator;
import math.CalculatorMemento;

public class ClearCommand extends AbstractCommand {
    private CalculatorMemento oldValue;

    @Override
    public void execute() {
        oldValue = Calculator.getInstance().getCalculatorMemento();
        Calculator.getInstance().clear();
    }

    @Override
    public void undo() {
        Calculator.getInstance().setCalculatorMemento(oldValue);
    }

    @Override
    public boolean isQuery() {
        return false;
    }
}
