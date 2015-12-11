package Homework.week4.arrayStack;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayStackTest {
    ArrayStack arrayStack;

    @After
    public void tearDown() throws Exception {
        arrayStack = null;
    }

    @Test
    public void testGetSize(){
        arrayStack = new ArrayStack();
        assertEquals(0,arrayStack.getSize());
    }

    @Test
    public void testPush() throws Exception {
        arrayStack = new ArrayStack();
        arrayStack.push(new Node(1));
        arrayStack.push(new Node(1));
        assertEquals(2,arrayStack.getSize());
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public  void testPushException() throws Exception{
        arrayStack = new ArrayStack(1);
        arrayStack.push(new Node(1));
        arrayStack.push(new Node(1));
    }

    @Test
    public void testPop() throws Exception {
        arrayStack = new ArrayStack(3);
        Node node = new Node(4);
        arrayStack.push(new Node(1));
        arrayStack.push(node);
        Node buff =  arrayStack.pop();

        assertEquals(node,buff);
        assertEquals(1,arrayStack.getSize());

    }
    @Test (expected = IndexOutOfBoundsException.class)
    public void testPopException() throws Exception {
        arrayStack = new ArrayStack();
        arrayStack.pop();
    }

    @Test
    public void testClearStack() throws Exception {
        arrayStack = new ArrayStack(6);
        arrayStack.push(new Node(2));
        arrayStack.push(new Node(4));
        arrayStack.push(new Node(1));
        arrayStack.push(new Node(6));
        arrayStack.push(new Node(10));

        arrayStack.clearStack();
        assertEquals(0, arrayStack.getSize());

    }
}
