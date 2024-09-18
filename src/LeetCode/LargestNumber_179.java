package LeetCode;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber_179 {
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9}; // Example input
        LargestNumber_179 solution = new LargestNumber_179();
        String result = solution.largestNumber(nums);
        System.out.println("The largest number is: " + result);
    }
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String elements[] = new String[n];
        for(int i=0; i<n; i++){
            elements[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(elements, new Comparator<String>(){
            public int compare(String a, String b){
                String first = a+b;
                String sec = b+a;
                return sec.compareTo(first);
            }
        });
        if(elements[0].equals("0")){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(String val:elements){
            sb.append(val);
        }
        return sb.toString();
    }
}
