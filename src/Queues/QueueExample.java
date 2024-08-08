package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
//        first in first out
        queue.add(3);
        queue.add(5);
        queue.add(8);
        queue.add(1);

//        gets head of the item
        System.out.println(queue.peek());
//        removes items from start
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
