package LeetCode;

public class ShortestPalindrome_214 {
    public static void main(String[] args) {
        ShortestPalindrome_214 solution = new ShortestPalindrome_214();

        // Test cases
        String s1 = "aacecaaa";
        String s2 = "abcd";

        // Test the shortestPalindrome function
        System.out.println("Shortest Palindrome for '" + s1 + "': " + solution.shortestPalindrome(s1)); // Expected: "aacecaaa"
        System.out.println("Shortest Palindrome for '" + s2 + "': " + solution.shortestPalindrome(s2)); // Expected: "dcbabcd"
    }
    // Helper method to check if a substring is palindrome or not
    private boolean isPalindrome(String s, int l, int r) {
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    // Method to find the shortest palindrome
    public String shortestPalindrome(String s) {
        // Find the longest palindromic prefix and return the shortest palindrome
        for (int r = s.length() - 1; r >= 0; r--) {
            if (isPalindrome(s, 0, r)) {
                String suffix = s.substring(r + 1);
                String reversedSuffix = new StringBuilder(suffix).reverse().toString();
                return reversedSuffix + s;
            }
        }
        return "";
    }
}
