package command;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommandHistory {

    private Deque<Command> undoStack= new ArrayDeque<>();
    private Deque<Command> redoStack= new ArrayDeque<>();

    public CommandHistory() {
    }

    public void add(Command command) {
        if(command.isQuery()) return ;
        redoStack.clear();
        undoStack.push(command);

    }

    public void undo() {
        if(undoStack.isEmpty()){
            System.out.println("can't undo");
            return ;
        }
        var command = undoStack.pop();
        command.undo();
        redoStack.push(command);
    }

    public void redo() {


        if(redoStack.isEmpty()){
            System.out.println("can't redo");
            return ;
        }
        var command = redoStack.pop();
        command.execute();
        undoStack.push(command);
    }
}
