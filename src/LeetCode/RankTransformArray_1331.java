package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformArray_1331 {
    public static void main(String[] args) {
        RankTransformArray_1331 sol = new RankTransformArray_1331();

        // Example test case 1
        int[] arr1 = {40, 10, 20, 30};
        int[] rankedArr1 = sol.arrayRankTransform(arr1);
        System.out.println("Test Case 1: " + Arrays.toString(rankedArr1));  // Output: [4, 1, 2, 3]

        // Example test case 2
        int[] arr2 = {100, 100, 100};
        int[] rankedArr2 = sol.arrayRankTransform(arr2);
        System.out.println("Test Case 2: " + Arrays.toString(rankedArr2));  // Output: [1, 1, 1]

        // Example test case 3
        int[] arr3 = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        int[] rankedArr3 = sol.arrayRankTransform(arr3);
        System.out.println("Test Case 3: " + Arrays.toString(rankedArr3));  // Output: [5, 3, 4, 2, 8, 6, 7, 1, 3]
    }
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) return arr;  // Edge case: If the array is empty

        // Create a copy of the original array and sort it
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        // Create a map to store the rank of each element
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        // Assign ranks to unique elements in the sorted array
        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank);
                rank++;
            }
        }

        // Replace each element in the original array with its rank
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }
}
