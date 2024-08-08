package Queues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(16);
        queue.insert(80);
        queue.insert(45);
        queue.insert(23);
        queue.insert(78);
        queue.display();
        System.out.println(queue.remove());
        System.out.println(queue.front());
        queue.display();
    }
}
