package command;

public abstract class AbstractCommand implements Command{
    @Override
    public void parse(String[] tokens) {
        // Ok
    }


    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public boolean isQuery() {
        return true;
    }
}
