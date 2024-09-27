package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Calender2_731 {
    public static void main(String[] args) {
        Calender2_731 calendar = new Calender2_731();

        // Test bookings
        System.out.println(calendar.book(10, 20)); // Should return true, as the booking is allowed
        System.out.println(calendar.book(50, 60)); // Should return true, as the booking is allowed
        System.out.println(calendar.book(10, 40)); // Should return true, as there is no triple booking
        System.out.println(calendar.book(5, 15));  // Should return false, as it causes a triple booking
        System.out.println(calendar.book(5, 10));  // Should return true, as there is no triple booking
        System.out.println(calendar.book(25, 55)); // Should return true, as there is no triple booking
    }
    List<int[]> bookings;
    TreeMap<Integer, Integer> overlappedMap;
    public Calender2_731() {
        bookings = new ArrayList<>();
        overlappedMap = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Integer prevVal = overlappedMap.lowerKey(end);
        if(prevVal!=null && start<=overlappedMap.get(prevVal)-1 ){
            return false;
        }
        for(int booking[]: bookings){
            int commStart = Math.max(booking[0], start);
            int commEnd = Math.min(booking[1], end);
            if(commStart<commEnd){
                overlappedMap.put(commStart, commEnd);
            }
        }
        bookings.add(new int[]{start, end});
        return true;
    }
}
