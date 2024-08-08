package LeetCode;

import java.util.Scanner;

// 26. Remove Duplicates from Sorted Array
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,2,3,4,5,5};
        int newLength = removeDuplicates(nums);
        System.out.println("after removing duplicates : " +newLength);

        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static int removeDuplicates(int[] nums){
        if (nums.length==0) return 0;
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
