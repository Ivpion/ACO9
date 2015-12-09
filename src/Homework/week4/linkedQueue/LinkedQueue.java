package Homework.week4.linkedQueue;

import Homework.week4.IQueuePolutshe;

/**
 * Created by ivan on 04.12.15.
 */
public class LinkedQueue  implements IQueuePolutshe {


    private Node head;
    private Node tail;
    private int count = 0;

    public Node getTail() {
        return tail;
    }

    public Node getHead() {
        return head;
    }

    @Override
    public void enqueue(Node node){
        if (tail == null){
            head = node;
            tail = node;
        } else {
            tail.nextNode = node;
            tail = node;
        }
        count++;
    }

    @Override
    public Node dequeue() {
        Node buff = head;
        head = head.nextNode;
        count--;
        if (count == 0){
            head = null;
            tail = null;
        }
        return buff;
    }

    @Override
    public int getSize(){
        return count;
    }



}
