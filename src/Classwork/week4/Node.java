package Classwork.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by serhii on 29.11.15.
 */
public class Node {


    public int value; // todo see wrappers
    public List<Node> children = new ArrayList<>();

    public Node(int value, Node... children) {
        this.value = value;
        this.children = Arrays.asList(children);
    }

    public void addChild(Node node) {
        children.add(node);
    }

}
