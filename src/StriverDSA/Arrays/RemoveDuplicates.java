package StriverDSA.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,4,4,5,5,5};
        int n = arr.length;
        System.out.println(removeDuplicates(arr,n));
    }
    public static int removeDuplicates(int[] arr,int n) {
        int i = 0;
        for (int j = 1; j <n; j++) {
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
