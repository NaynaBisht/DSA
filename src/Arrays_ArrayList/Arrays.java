package Arrays_ArrayList;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        store a roll num
        int rn = 23;

//        store 5 roll num
//        array syntax = datatype[] var = new datatype[sizer];
        int[] rnos = new int[5];
//        or
        int[] rnos2 = {23,1,4,6,8};
//        all datatypes inside should be same

        int[] arr = new int[5];
        System.out.println(arr[1]);

        String[] ar = new String[5];
//        by def null  since all ref var point to null
//        strings are ref and not primitives
        System.out.println(ar[4]);

//        input using loops
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements : ");
        int[] array = new int[5];
        for (int i = 0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

//        here num represents element of the array
//        for every element in array print array
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();
//        3rd way to print
//        converts num to string and prints brackets and commas too
        System.out.println(java.util.Arrays.toString(array));

//        for array of objects
        System.out.println();
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(java.util.Arrays.toString(str));


    }
}
