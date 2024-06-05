package composite;

import java.util.*;

public class Node extends AbstractNode{

    private List<AbstractNode> children = new ArrayList<>();

    public Node(String label) {
        super(label);
    }

    public void addChild(AbstractNode child) {
        child.setParent(this);
        children.add(child);
    }

    public void removeChild(AbstractNode child) {

        if(children.remove(child))
            child.setParent(null);
    }


    @Override
    public List<AbstractNode> getChildren() {
        return Collections.unmodifiableList(children);
    }
}
