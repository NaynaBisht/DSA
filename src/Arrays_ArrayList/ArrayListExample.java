package Arrays_ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
//        when u dont know how much array size you want

//        syntax

        ArrayList<Integer> list = new ArrayList<>(10);
//        initial capacity can be given
        list.add(23);
        list.add(231);
        list.add(523);
        list.add(104);
        list.add(897);
        System.out.println(list);

        System.out.println(list.contains(34));

        list.set(0,99);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.get(3));
    }
}
