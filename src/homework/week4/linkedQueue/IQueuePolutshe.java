package homework.week4.linkedQueue;

/**
 * Created by ivan on 10.12.15.
 */
public interface IQueuePolutshe extends Iterable{
    void enqueue(Node node);

    Node dequeue();

    int getSize();

    void clearAll();
}
