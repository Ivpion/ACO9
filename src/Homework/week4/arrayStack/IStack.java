package Homework.week4.arrayStack;



/**
 * Created by ivan on 10.12.15.
 */
public interface IStack <T> {

    public void push(T t);

    public T pop();

    public int getSize();

    public void clearStack();


}
