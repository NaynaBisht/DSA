package StriverDSA.Arrays;

public class SecondLargestSmallest {
    public static void main(String[] args) {
        int[] arr = {12, 3, 43, 67, 45, 87};
        int n = arr.length;
        int largest = secondLargest(arr,n);
        int smallest = secondSmallest(arr,n);
        System.out.println("Second Largest: " + largest);
        System.out.println("Second Smallest: " + smallest);
    }
    public static int secondLargest(int []arr, int n) {
        int largest = arr[0];
        int slargest = -1;
        for(int i=1; i<n; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];

            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        return slargest;
    }
    public static int secondSmallest(int[] arr, int n){
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if(arr[i]<smallest){
                ssmallest = smallest;
                smallest = arr[i];

            }
            else if(arr[i] != smallest && arr[i]<ssmallest){
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }
}


