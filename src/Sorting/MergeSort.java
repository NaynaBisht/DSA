package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        
        int[] arr2 = {5,4,3,2,1,};
//        the below statement is wrong since not returning anything
//        arr2 = mergeSortInPlace(arr2, 0, arr2.length);
        mergeSortInPlace(arr2, 0, arr2.length);
        System.out.println(Arrays.toString(arr2));
    }
    static int[] mergeSort(int[] arr){
//        base condition
        if(arr.length==1)
            return arr;

        int mid = arr.length/2;

//        copyOfRange basically replicates the array
//        from the start to end value
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    static int[] merge(int[] left, int[] right){
        int[] mix = new int[left.length+ right.length];

        int i = 0; // pointer for arr1
        int j = 0; // pointer for arr2
        int k = 0; // pointer for arr

        while (i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k] = left[i];
                i++;
            }
            else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
    //  it may be possible that one of the arrays is not complete
        while(i< left.length){
            mix[k]= left[i];
            i++;
            k++;
        }
        while(j<right.length){
            mix[k]= right[j];
            j++;
            k++;
        }
        return mix;
    }

    static void mergeSortInPlace(int[] arr, int s, int e){
//        base condition
        if(e-s==1)
            return ;

        int mid = (s+e)/2;

//        copyOfRange basically replicates the array
//        from the start to end value
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }
    private static void mergeInPlace(int[] arr, int s, int m, int e){
        int[] mix = new int[e-s];

        int i = s; // pointer for arr1
        int j = m; // pointer for arr2
        int k = 0; // pointer for arr

        while (i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        //  it may be possible that one of the arrays is not complete
        while(i< m){
            mix[k]= arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]= arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
