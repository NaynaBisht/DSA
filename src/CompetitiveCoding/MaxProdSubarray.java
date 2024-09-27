package CompetitiveCoding;

public class MaxProdSubarray {

    public static void main(String[] args) {
        int arr[] = {2,3,-2,4};
        System.out.println(maxProductSubarray(arr));
    }
    static int maxProductSubarray(int arr[]){
        int maxProduct = arr[0], minProduct = arr[0], globalMax = arr[0];

        for (int i = 1; i < arr.length ; i++) {

            int temp = Math.max(arr[i], Math.max(maxProduct*arr[i], minProduct*arr[i]));

            minProduct = Math.min(arr[i], Math.min(maxProduct*arr[i], minProduct*arr[i]));

            maxProduct = temp;

            globalMax = Math.max(globalMax, maxProduct );
        }
        return globalMax;
    }
}
