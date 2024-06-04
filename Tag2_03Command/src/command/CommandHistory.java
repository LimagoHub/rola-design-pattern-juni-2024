package command;

public class CommandHistory {

    public CommandHistory() {
    }

    public void add(Command command) {
        if(command.isQuery()) return ;

        // TODO Implement this
    }

    public void undo() {
        System.out.println("can't undo");
    }

    public void redo() {
        System.out.println("can't redo");
    }
}
