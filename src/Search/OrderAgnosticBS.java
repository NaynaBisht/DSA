package Search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -2, 0, 1, 2, 56, 89, 900};
        int target = 89;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);
    }
    static int orderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

//        find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start]<arr[end];

        while (start <= end) {
//            find middle element
            int mid = start + (end - start) / 2;

            if(arr[mid]==target)
                return mid;

            if(isAsc){
                if (target<arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
