package LinkedLists;

public class Main {
    public static void main(String[] args) {
        LinkedListExample list = new LinkedListExample();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(5);
        list.insertFirst(19);
        list.insertFirst(50);
//        will be printed from below
        list.display();

        list.insertLast(99);
        list.display();

        System.out.println();
        list.insert(100,3);
        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(2));
        list.display();

        System.out.println(list.find(2));
        list.display();
    }
}
