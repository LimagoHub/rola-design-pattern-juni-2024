package composite;

import composite.visitors.KontoVisitor;

import java.util.*;

public class KontoGruppe extends AbstractKontoNode {

    private List<AbstractKontoNode> children = new ArrayList<>();

    public KontoGruppe(String label) {
        super(label);
    }

    public void addChild(AbstractKontoNode child) {
        child.setParent(this);
        children.add(child);
    }

    public void removeChild(AbstractKontoNode child) {

        if(children.remove(child))
            child.setParent(null);
    }


    @Override
    public List<AbstractKontoNode> getChildren() {
        return Collections.unmodifiableList(children);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("KontoGruppe{");
        sb.append("label=").append(getLabel());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void accept(KontoVisitor visitor) {
        visitor.visit(this);
    }
}
