package CompetitiveCoding;

import java.util.Scanner;

public class MajorityElemInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = majorityElem(arr);
        if(result!=-1)
            System.out.println(result);
        else
            System.out.println("No Majority Element");
    }
    static int majorityElem(int[] nums){
        int candidate = 0, count = 0;
        for(int num:nums){
            if(count==0){
                candidate = num;
            }
            count = count + ((num==candidate)? 1:-1);
        }
        count = 0;
        for(int num:nums){
            if(num==candidate)
                count++;
        }
        if (count>nums.length/2)
            return candidate;
        else return -1;
    }
}
