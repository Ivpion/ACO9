package Homework.week4.arrayStack;

/**
 * Created by ivan on 10.12.15.
 */
public class ArrayStack implements IStack {

    private static final int DEFAULT_MAX_STACK_SIZE = 10;

    public Node[] nodesMas;
    public int carrentIndex = 0; // [i] in nodesMas

    public ArrayStack() {
        nodesMas = new Node[DEFAULT_MAX_STACK_SIZE];
       //this.size = DEFAULT_MAX_STACK_SIZE;

    }

    public ArrayStack(int size) {
        nodesMas = new Node[size];
        //this.size = size;
    }



    @Override
    public void push(Node node) {
        if(isSpaceAvailable()) {
            nodesMas[carrentIndex] = node;
            carrentIndex++;
        } else throw new IndexOutOfBoundsException();
    }

    @Override
    public Node pop() {
        if (carrentIndex >= 1) {
            Node node = nodesMas[carrentIndex - 1];
            carrentIndex--;

            return node;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int getSize() {
        return carrentIndex;
    }

    @Override
    public void clearStack() {
        for (int i = 0; i <nodesMas.length ; i++) {
            nodesMas[i] = null;
        }
        carrentIndex = 0;
    }

    @Override
    public boolean isSpaceAvailable() {
        return carrentIndex < nodesMas.length;
    }
}
