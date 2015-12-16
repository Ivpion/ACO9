package homework.week4.arrayQueue;

/**
 * Created by ivan on 04.12.15.
 */
public class TestArrayQueue {
    public static void main(String[] args) {


        ArrayQueue arrayQueue = new ArrayQueue();

        arrayQueue.enqueue(123);
        arrayQueue.enqueue(1234);
        arrayQueue.enqueue(12);
        arrayQueue.dequeue();
        System.out.println(arrayQueue.toString());
    }
}
