package Queues;

public class CircularMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(16);
        queue.insert(80);
        queue.insert(45);
        queue.insert(23);
        queue.insert(78);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(133);
        queue.display();
    }
}