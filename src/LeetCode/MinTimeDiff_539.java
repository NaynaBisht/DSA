package LeetCode;

import java.util.Arrays;
import java.util.List;

public class MinTimeDiff_539 {
    public static void main(String[] args) {
        MinTimeDiff_539 solution = new MinTimeDiff_539();

        // Test Case 1
        List<String> timePoints1 = Arrays.asList("23:59", "00:00");
        int result1 = solution.findMinDifference(timePoints1);
        System.out.println("Test Case 1: " + result1);  // Expected output: 1

        // Test Case 2
        List<String> timePoints2 = Arrays.asList("00:00", "04:00", "22:00");
        int result2 = solution.findMinDifference(timePoints2);
        System.out.println("Test Case 2: " + result2);  // Expected output: 120

        // Test Case 3 - Same time points
        List<String> timePoints3 = Arrays.asList("12:30", "12:30");
        int result3 = solution.findMinDifference(timePoints3);
        System.out.println("Test Case 3: " + result3);
    }
    public int findMinDifference(List<String> timePoints) {
        boolean mins[] = new boolean[1440];
        for(String time : timePoints){
            int h = Integer.parseInt(time.substring(0,2));
            int m = Integer.parseInt(time.substring(3,5));
            int minutes = h*60+m;
            if(mins[minutes]) return 0;
            mins[minutes] = true;
        }
        int prev = -1;
        int firstVal = -1;
        int minDiff = Integer.MAX_VALUE;
        for(int cur = 0; cur<1440; cur++){
            if(mins[cur]){
                if(prev==-1){
                    firstVal = cur;
                    prev=cur;
                }else{
                    minDiff = Math.min(minDiff, cur-prev);
                    prev = cur;
                }
            }
        }
        if(prev!=-1){
            minDiff = Math.min(minDiff, 1440 + firstVal - prev);
        }
        return minDiff;
    }
}
