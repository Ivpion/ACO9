package Homework.week4.arrayStack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayStackTest {
    ArrayStack arrayStack;

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
    @Test (expected = NullPointerException.class)
    public void testPopException() throws Exception {
        arrayStack.pop();

    }

}
