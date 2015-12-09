package Homework.week4.linkedQueue;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ivan on 09.12.15.
 */
public class LinkedQueueTest {

  private LinkedQueue linkedQueue;
  private Node node;
  private Node node1;
  private Node node2;

    @Before
    public void setUp() throws Exception {
        linkedQueue = new LinkedQueue();
        node = new Node(1);
        node1 = new Node(2);
        node2 = new Node(3);

    }

    @Test
    public void testGetSize() throws Exception {

        assertTrue(linkedQueue.getSize() == 0);
    }
    @Test
    public void testEnqueue() throws Exception {
        LinkedQueue linkedQueue = new LinkedQueue();

        linkedQueue.enqueue(null); //must throw exception

        linkedQueue.enqueue(node);
        linkedQueue.enqueue(node1);
        linkedQueue.enqueue(node2);

        assertTrue(linkedQueue.getHead() == node);
        assertTrue(linkedQueue.getTail() == node2);
        assertTrue(linkedQueue.getSize() == 3);
    }

    @After
    public void tearDown() throws Exception {


    }



    @Test
    public void testDequeue() throws Exception {
        linkedQueue.dequeue(); //must throw exception if size = 0;

        linkedQueue.enqueue(node);
        linkedQueue.enqueue(node1);
        linkedQueue.enqueue(node2);
        linkedQueue.dequeue();
        linkedQueue.dequeue();
        Node buff =  linkedQueue.dequeue();


        assertTrue(node2 == buff);
        assertTrue(linkedQueue.getTail() == null);
        assertTrue(linkedQueue.getHead() == null);
        assertTrue(linkedQueue.getSize() == 0);

    }
}