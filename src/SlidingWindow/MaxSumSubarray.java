package SlidingWindow;
// Maximum Sum Subarray of size K
public class MaxSumSubarray {
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,7,2,1,3,5};
        int size = arr.length;
        int k = 3;
        // edge case
        if (k > size) {
            System.out.println("Subarray size is larger than array size.");
            return;
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int i = 0, j = 0;

        while (j<size){
            sum += arr[j];

            if(j-i+1<k) j++;

            else if(j-i+1 == k){
                max = Math.max(max, sum);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        System.out.println("Maximum sum of subarray of size " + k + " is: " + max);
    }
}
