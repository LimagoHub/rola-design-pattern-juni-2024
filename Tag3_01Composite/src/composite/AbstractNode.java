package composite;

import java.util.*;

public class AbstractNode {

    private AbstractNode parent = null;
    private String label;


    public AbstractNode(String label) {
        this.label = label;
    }

    public List<AbstractNode> getChildren() {
        return Collections.emptyList();
    }

    public AbstractNode getParent() {
        return parent;
    }

    public void setParent(AbstractNode parent) {
        this.parent = parent;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName() + "{");
        sb.append("label='").append(label).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
