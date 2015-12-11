package Homework.week4.linkedStack;

/**
 * Created by ivan on 11.12.15.
 */
public interface IStack <E> {

    public void push(E e);

    public E pop();

    public int getSize();

    public void clearStack();


}
