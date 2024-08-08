package Arrays_ArrayList;

import java.util.Arrays;

public class Maximum {
    public static void main(String[] args) {
        int[] arr = {12,27,31,84,76};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 3));
    }
    static int max(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > temp){
                temp = arr[i];
            }
        }
        return temp;
    }
    static int maxRange(int[] arr, int start, int end){
        int temp = arr[start];
        for (int i = start; i < end ; i++) {
            if(arr[i] > temp){
                temp = arr[i];
            }
        }
        return temp;
    }
}
