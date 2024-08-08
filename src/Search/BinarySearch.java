package Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -2, 0, 1, 2, 56, 89, 900};
        int target = 0;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
//     return the index
//     return -1 if does not exist

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
//            find middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid]) {
                start = mid + 1;
            } else
                return mid;
        }
        return -1;
    }
}
