package LeetCode;

import java.util.TreeMap;
public class Calender_729 {
    public static void main(String[] args) {
        Calender_729 myCalendar = new Calender_729();

        // Test cases
        System.out.println(myCalendar.book(10, 20)); // true
        System.out.println(myCalendar.book(15, 25)); // false, overlap with [10, 20]
        System.out.println(myCalendar.book(20, 30)); // true, no overlap
        System.out.println(myCalendar.book(5, 10));  // true, no overlap
        System.out.println(myCalendar.book(5, 15));  // false, overlap with [10, 20]
    }
    TreeMap<Integer, Integer> map;
    public Calender_729(){
        map = new TreeMap<>();
    }
    public boolean book(int start, int end){
        Integer preVal = map.lowerKey(end);
        if(preVal!=null && start <= map.get(preVal)-1){
            return false;
        }
        map.put(start,end);
        return true;
    }
}
