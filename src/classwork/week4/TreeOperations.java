package classwork.week4;

import homework.week4.IQueue;

import java.util.List;

/**
 * Created by serhii on 29.11.15.
 */
public class TreeOperations {



    public static int makeIntReportR(Node node){

        int amount = node.value;
        for (Node child : node.children) {
            amount += makeIntReportR(child);
        }

        return amount;
    }

    public static int makeIntReport(Node node){
        List<Node> children = node.children;

        if(children.isEmpty()){
            return node.value;
        }

        int amount = 0;
        for (int i = 0; i < children.size(); i++) {
            int childRes = makeIntReport(children.get(i));
            amount += childRes;
        }

        amount += node.value;

        return amount;
    }

    public static int makeReportViaQueue(Node node, IQueue queue){

        if(node == null){
            return 0;
        }

        queue.enqueue(node);

        int amount = 0;

        while(queue.getSize() != 0){
            Node element = (Node) queue.dequeue();// get first element from head
            amount += element.value;
            for(Node child : element.children){
                queue.enqueue(child);
            }
        }

        return amount;

    }

}
