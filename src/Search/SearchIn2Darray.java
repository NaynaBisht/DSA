package Search;

import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,45,90,6},
                {56,80,24,12}
        };
        int target=90;
        int[] ans = search(arr,target); // format of return value{row,col}
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));

        System.out.println(Integer.MIN_VALUE);
    }
    static int[] search(int[][] arr, int target ){
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target)
                    return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if(arr[row][col] > max)
                    max = arr[row][col];
            }
        }
        return max;
    }
}
