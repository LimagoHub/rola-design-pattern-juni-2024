package composite;

import composite.visitors.KontoVisitor;

import java.util.*;

public abstract class AbstractKontoNode implements Iterable<AbstractKontoNode>{

    private AbstractKontoNode parent = null;
    private String label;


    public AbstractKontoNode(String label) {
        this.label = label;
    }

    public List<AbstractKontoNode> getChildren() {
        return Collections.emptyList();
    }

    public AbstractKontoNode getParent() {
        return parent;
    }

    public void setParent(AbstractKontoNode parent) {
        this.parent = parent;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void print() {
       for(AbstractKontoNode node : this){
           System.out.println(node);
       }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName() + "{");
        sb.append("label='").append(label).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Iterator<AbstractKontoNode> iterator() {
        final List<AbstractKontoNode> liste = new ArrayList<>();
        fillIteratorList(liste);
        return liste.iterator();
    }

    private void fillIteratorList(final List<AbstractKontoNode> liste){
        liste.add(this);
        for(var child: getChildren()){
            child.fillIteratorList(liste);
        }

    }

    public void iterate(KontoVisitor visitor){
        visitor.init();
        iterator().forEachRemaining(k->k.accept(visitor));
        visitor.dispose();
    }

    public abstract void accept(KontoVisitor visitor);
}
