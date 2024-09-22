package LeetCode;

public class KsmallestInLexicoOrder_440 {
    public static void main(String[] args) {
        KsmallestInLexicoOrder_440 solution = new KsmallestInLexicoOrder_440();

        int n = 13; // Example: consider numbers from 1 to 13
        int k = 2;  // Find the 2nd number in lexicographical order

        int result = solution.findKthNumber(n, k);
        System.out.println("The " + k + "th number in lexicographical order is: " + result);
    }
    public int findKthNumber(int n, int k) {
        int cur = 1;
        int i = 1;

        while (i < k) {
            long steps = countSteps(cur, n);
            if (i + steps <= k) {
                cur += 1;  // Move to the next node in the same level
                i += steps;  // Skip all the numbers under this subtree
            } else {
                cur *= 10;  // Move down to the next level
                i += 1;     // Increment by 1 for the next number
            }
        }

        return cur;
    }

    // Helper method to count the steps between current prefix and the next one
    private long countSteps(long cur, long n) {
        long steps = 0;
        long first = cur;
        long last = cur + 1;

        while (first <= n) {
            steps += Math.min(last, n + 1) - first;
            first *= 10;
            last *= 10;
        }

        return steps;
    }
}
