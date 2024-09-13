package LeetCode;

public class XOR_Queries_1310 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 8};

        // Initialize the queries
        int[][] queries = {
                {0, 1},
                {1, 2},
                {0, 3},
                {3, 3}
        };

        // Create an instance of the Solution class
        XOR_Queries_1310 solution = new XOR_Queries_1310();

        // Call the xorQueries method and get the result
        int[] result = solution.xorQueries(arr, queries);

        // Print the result for each query
        for (int res : result) {
            System.out.print(res+" ");
        }
    }
    public int[] xorQueries(int[] arr, int[][] queries){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        int xor = prefix[0];
        for (int i = 1; i < arr.length; i++) {
            xor = xor^arr[i];
            prefix[i] = xor;
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            ans[i] = prefix[right];
            if (left>0){
                ans[i] = ans[i] ^ prefix[left-1];
            }
        }
        return ans;
    }
}
