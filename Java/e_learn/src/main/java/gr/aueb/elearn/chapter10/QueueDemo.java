package gr.aueb.elearn.chapter10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myQueue = new ArrayList<>();

        enQueue(myQueue, 1);
        enQueue(myQueue, 14);
        enQueue(myQueue, 2);
        enQueue(myQueue, 42);
        enQueue(myQueue, 13);
        enQueue(myQueue, 14);
        enQueue(myQueue, 122);

        printQueue(myQueue);
        System.out.println("Dequeue " + deQueue(myQueue));
        System.out.println("Dequeue " + deQueue(myQueue));
        System.out.println("Dequeue " + deQueue(myQueue));

        printQueue(myQueue);

        System.out.println("Peek " + peek(myQueue));
        
        System.out.println("Dequeue " + deQueue(myQueue));

        printQueue(myQueue);
    }

    private static void enQueue(ArrayList<Integer> list, Integer item) {
        list.add(item);
    }

    private static Integer deQueue(ArrayList<Integer> list) {
        if (list.size() != 0)
            return list.remove(0);
        return null;
    }

    private static Integer peek(ArrayList<Integer> list) {
        if (list.size() != 0)
            return list.get(0);
        return null;
    }

    private static void printQueue(ArrayList<Integer> list) {
        list.forEach(val -> System.out.printf("%d ", val));
        System.out.println();
    }

}
