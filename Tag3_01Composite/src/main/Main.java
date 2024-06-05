package main;

import composite.AbstractNode;
import composite.Leaf;
import composite.Node;

public class Main {
    public static void main(String[] args) {

        Node root = new Node("root");

        Node e1_1 = new Node("e1_1");
        Node e1_2 = new Node("e1_2");

        root.addChild(e1_1);
        root.addChild(e1_2);

        Node e2_1_1 = new Node("e2_1_1");
        e1_1.addChild(e2_1_1);

        Node e2_1_2 = new Node("e2_1_2");
        e1_1.addChild(e2_1_2);

        Leaf e2_2_1 = new Leaf("e2_2_1");
        e1_2.addChild(e2_2_1);

        Leaf e2_2_2 = new Leaf("e2_2_2");
        e1_2.addChild(e2_2_2);

        traverse(root);
    }

    private static void traverse(AbstractNode node) {
        System.out.println(node);
        for(var child: node.getChildren()){
            traverse(child);
        }
    }
}