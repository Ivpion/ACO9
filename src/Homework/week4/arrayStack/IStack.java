package Homework.week4.arrayStack;



/**
 * Created by ivan on 10.12.15.
 */
public interface IStack  {
    public boolean isSpaceAvailable();

    public void push(Node node);

    public Node pop();

    public int getSize();

    public void clearStack();


}
