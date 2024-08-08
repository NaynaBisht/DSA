package LinkedLists;

public class MainCircular {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(20);
        list.insert(56);
        list.insert(99);
        list.insert(14);
        list.insert(60);

        list.display();

        list.delete(99);
        list.display();
    }
}
