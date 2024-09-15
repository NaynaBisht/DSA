package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringVowelsEven_1371 {
    public static void main(String[] args) {
        LongestSubstringVowelsEven_1371 solution = new LongestSubstringVowelsEven_1371();

        // Test cases
        String s1 = "eleetminicoworoep"; // Expected output: 13
        String s2 = "leetcodeisgreat";   // Expected output: 5
        String s3 = "bcbcbc";            // Expected output: 6

        System.out.println("Test case 1: " + solution.findTheLongestSubstring(s1)); // Output: 13
        System.out.println("Test case 2: " + solution.findTheLongestSubstring(s2)); // Output: 5
        System.out.println("Test case 3: " + solution.findTheLongestSubstring(s3)); // Output: 6
    }
    public int findTheLongestSubstring(String s) {
        int xor = 0, ans=0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                xor = xor^c;
            }
            if(map.containsKey(xor))
                ans = Math.max(ans, i-map.get(xor));
            else
                map.put(xor,i);
        }
        return ans;
    }
}
