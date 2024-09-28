package LeetCode;

public class CircularDeque_641 {
    public static void main(String[] args) {
        CircularDeque_641 circularDeque = new CircularDeque_641(5);

        // Insert elements at the rear
        System.out.println(circularDeque.insertLast(10)); // true
        System.out.println(circularDeque.insertLast(20)); // true
        System.out.println(circularDeque.insertLast(30)); // true
        System.out.println(circularDeque.insertLast(40)); // true
        System.out.println(circularDeque.insertLast(50)); // true

        // Try to insert into a full deque
        System.out.println(circularDeque.insertLast(60)); // false (Deque is full)

        // Get elements from the front and rear
        System.out.println("Front element: " + circularDeque.getFront()); // 10
        System.out.println("Rear element: " + circularDeque.getRear());   // 50

        // Delete elements from front and rear
        System.out.println(circularDeque.deleteFront()); // true
        System.out.println(circularDeque.deleteLast());  // true

        // Check the front and rear after deletions
        System.out.println("Front element after deletion: " + circularDeque.getFront()); // 20
        System.out.println("Rear element after deletion: " + circularDeque.getRear());   // 40

        // Check if the deque is full or empty
        System.out.println("Is deque full? " + circularDeque.isFull()); // false
        System.out.println("Is deque empty? " + circularDeque.isEmpty()); // false
    }
    int front;
    int rear;
    int size;
    int capacity;
    int deque[];
    public CircularDeque_641(int k) {
        deque = new int[k];
        front = 0;
        rear = k-1;
        size = 0;
        capacity = k;
    }

    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        front = (front-1+capacity)%capacity;
        deque[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        rear = (rear+1)%capacity;
        deque[rear] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        front = (front+1)%capacity;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        rear = (rear-1+capacity)%capacity;
        size--;
        return true;
    }

    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return deque[front];
    }

    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return deque[rear];
    }

    public boolean isEmpty() {
        return (size==0);
    }

    public boolean isFull() {
        return (size==capacity);
    }
}
