package StriverDSA.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10,21,13,45,5};
        int largest = arr[0];
        int n = arr.length;
        for (int i = 1; i<n; i++){
            if(arr[i]>largest)
                largest = arr[i];
        }
        System.out.println(largest);
    }
}
