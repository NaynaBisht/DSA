package LeetCode;

import java.util.Arrays;
import java.util.HashSet;

public class ExtraCharsInStr_2707 {
    public static void main(String[] args) {
        // Example input
        String s = "leetcode";
        String[] dictionary = {"leet", "code", "co"};

        // Create an instance of Solution and call the method
        ExtraCharsInStr_2707 solution = new ExtraCharsInStr_2707();
        int result = solution.minExtraChar(s, dictionary);

        // Print the result
        System.out.println("Minimum extra characters: " + result);
    }
    int dp[] = new int[50];
    public int minExtraChar(String s, String[] dictionary) {
        int n = s.length();
        Arrays.fill(dp, -1);
        HashSet<String> dictionarySet = new HashSet <>(Arrays.asList(dictionary));
        return recur(s,dictionarySet, 0);
    }
    public int recur(String s, HashSet <String> dictionary, int index){
        if(index == s.length()){
            return 0;
        }
        if(dp[index]!= -1){
            return dp[index];
        }
        StringBuilder sb = new StringBuilder();
        int minExtraChar = Integer.MAX_VALUE;
        for(int i=index; i<s.length(); i++){
            sb.append(s.charAt(i));
            int extraChar = 0;
            if(!dictionary.contains(sb.toString())){
                extraChar = sb.length();
            }
            int curExtra = recur(s, dictionary, i+1);
            minExtraChar = Math.min(minExtraChar, extraChar+curExtra);
        }
        return dp[index] =  minExtraChar;
    }
}
