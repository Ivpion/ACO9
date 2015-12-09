package Homework.week4.linkedQueue;


import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ivan on 09.12.15.
 */
public class LinkedQueueTest {

    @Test
    public void testGetSize() throws Exception {
        LinkedQueue linkedQueue = new LinkedQueue();
        assertTrue(linkedQueue.getSize() == 0);
    }
    @Test
    public void testEnqueue() throws Exception {
        LinkedQueue linkedQueue = new LinkedQueue();
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(1);

        linkedQueue.enqueue(node);
        linkedQueue.enqueue(node1);
        linkedQueue.enqueue(node2);

        linkedQueue.dequeue();
        assertTrue(linkedQueue.getHead() == node);
        assertTrue(linkedQueue.getTail() == node2);
        assertTrue(linkedQueue.getSize() == 3);
    }





}