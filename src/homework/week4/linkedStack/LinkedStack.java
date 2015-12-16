package homework.week4.linkedStack;

/**
 * Created by ivan on 11.12.15.
 */
public class LinkedStack<E> implements IStack<E> {
    public Node<E> top;
    public int count;

    @Override
    public void push(E e) {
        top = new Node(e, top);
        count++;
    }

    @Override
    public E pop() {
        if (top == null) throw new RuntimeException();
        E buff = top.value;
        top = top.nextNode;
        count--;
        return buff;
    }

    @Override
    public int getSize() {
        return count;
    }

    @Override
    public void clearStack() {
        top = null;
        count = 0;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        Node res = top;
        while (res != null) {
            sb.append(res.value + ",");
            res = res.nextNode;
        }
        sb.append("}");
        return sb.toString();
    }
}
