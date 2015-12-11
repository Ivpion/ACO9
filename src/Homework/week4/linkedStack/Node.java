package Homework.week4.linkedStack;

/**
 * Created by ivan on 11.12.15.
 */
public class Node <E> {
    public E value;
    public Node<E> nextNode;

    public Node(E value) {
        this.value = value;
    }

    public Node(E value, Node<E> nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }
}
