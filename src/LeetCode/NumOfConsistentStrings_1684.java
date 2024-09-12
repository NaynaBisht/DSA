package LeetCode;

import java.util.HashSet;

public class NumOfConsistentStrings_1684 {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};

        // Create an instance of the class
        NumOfConsistentStrings_1684 solution = new NumOfConsistentStrings_1684();

        // Call the method and print the result
        int result = solution.countConsistentStrings(allowed, words);
        System.out.println("Number of consistent strings: " + result);
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0; i<allowed.length(); i++){
            set.add(allowed.charAt(i));
        }
        for(String str:words){
            boolean flag = true;
            for(int i=0; i<str.length(); i++){
                if(!set.contains(str.charAt(i))){
                    flag = false;
                }
            }
            if(flag) counter++;
        }
        return counter;
    }
}
