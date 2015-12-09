package Homework.week4.linkedQueue;

/**
 * Created by ivan on 09.12.15.
 */
public class Node extends Object {

    public int value;
    public Node nextNode;

    public Node(int value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public Node(int value) {
        this.value = value;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
