package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr ={5,2,56,21,78,9};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[]num, int low, int high){
        if (low>=high)
            return;

//        low and high are parameters
//        to define which part of the array you are working on
//        and start and end are used to swap

        int s = low;
        int e = high;
        int m = s+(e-s)/2;
        int pivot = num[m];
        while (s<=e){
            while (num[s]< pivot){
                s++;
            }
            while (num[e]>pivot)
                e--;

            if(s<=e){
                int temp = num[s];
                num[s] = num[e];
                num[e] = temp;
                s++;
                e--;
            }
        }
//      now my pivot is at correct index please sort the two halves now
        sort(num, low, e);
        sort(num, s, high);
    }
}
