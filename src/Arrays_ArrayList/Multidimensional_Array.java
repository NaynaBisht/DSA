package Arrays_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional_Array {
    public static void main(String[] args) {
//        [rows][cols] - specifying rows is mandatory
        int[][] arrm = new int[3][];

//        no of cols can vary
        
        int[][] arr2D = {
                {1,2,3},
                {2,3},
                {6,7,8,9}
        };
        
//        input
        int[][] arr = new int[3][2];
        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
//            for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

//        enhanced for
        for (int[] a: arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}
