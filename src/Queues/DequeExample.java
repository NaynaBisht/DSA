package Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(32);
        deque.addLast(43);

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
