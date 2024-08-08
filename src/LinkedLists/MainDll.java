package LinkedLists;

public class MainDll {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(39);
        list.insertFirst(919);
        list.insertFirst(45);
        list.insertFirst(708);
        list.insertFirst(86);

        list.display();
        list.displayReverse();

        list.insertLast(108);
        list.display();
        list.displayReverse();

        System.out.println();
        list.insertAfter(45, 69);
        list.display();
    }
}
