package CompetitiveCoding;

public class BlockSwap {
    public static void main(String[] args) {
        int n = 7;
        int d = 3;
        int[] arr = {1,2,3,4,5,6,7};

        leftRotate(arr, d%n, n);
        printArray(arr);
    }
    static void leftRotate(int[] arr, int d, int n){
        if(d==0 || d==n) return;

        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);

    }
    static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
