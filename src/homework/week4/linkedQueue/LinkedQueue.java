package homework.week4.linkedQueue;

import java.util.Iterator;

/**
 * Created by ivan on 04.12.15.
 */
public class LinkedQueue  implements IQueuePolutshe {


    private Node head;
    private Node tail;
    private int count = 0;

    @Override
    public Iterator iterator() {
        return new LinkedQueueIterator();
    }

    public Node getTail() {
        return tail;
    }

    public Node getHead() {
        return head;
    }

    @Override
    public void enqueue(Node node){
        if (node == null) throw new QueueExeption();
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
        if (head == null) throw new QueueNullPointExeption();
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

    @Override
    public void clearAll() {
        this.tail = null;
        this.head = null;
        this.count = 0;
    }

   /* @Override
    public String toString() {
       StringBuffer sb = new  StringBuffer();
        return str;
    }*/

    private class LinkedQueueIterator implements Iterator {

        private Node curr = head;

        @Override
        public boolean hasNext(){
            return curr != null;
        }

        @Override
        public Node next(){
            Node currentObj = curr;
            curr = curr.nextNode;
            return currentObj;
        }

    }
}
