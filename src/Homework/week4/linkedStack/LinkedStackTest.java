package Homework.week4.linkedStack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ivan on 11.12.15.
 */
public class LinkedStackTest {
    LinkedStack<String> linkedStack;

    @Before
    public void setUp() throws Exception {
        linkedStack = new LinkedStack();
    }

    @Test
    public void testPush() {

        linkedStack.push("1");
        linkedStack.push("2");
        linkedStack.push("3");
        linkedStack.push("4");
        linkedStack.push("5");

        assertEquals(5, linkedStack.getSize());

        System.out.println(linkedStack.toString());
    }

    @Test
    public void testPop() throws Exception {
        linkedStack.push("1");
        linkedStack.push("2");
        linkedStack.push("3");
        linkedStack.push("4");


        linkedStack.pop();
        String buff = linkedStack.pop();
        assertEquals("3", buff);
        assertEquals(2, linkedStack.getSize());

        System.out.println(linkedStack.toString());
    }

    @Test(expected = RuntimeException.class)
    public void testPopException() throws Exception {
        linkedStack.pop();
    }

    @Test
    public void testClearStack() throws Exception {
        linkedStack.push("1");
        linkedStack.push("2");
        linkedStack.push("3");
        linkedStack.push("4");

        linkedStack.clearStack();

        assertEquals(0, linkedStack.getSize());
        assertEquals(null, linkedStack.top);
    }
}
