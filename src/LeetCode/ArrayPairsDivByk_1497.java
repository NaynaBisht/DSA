package LeetCode;

import java.util.Scanner;

public class ArrayPairsDivByk_1497 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        ArrayPairsDivByk_1497 checker = new ArrayPairsDivByk_1497();
        boolean result = checker.canArrange(arr, k);

        if (result) {
            System.out.println("The array can be arranged such that the sum of every pair is divisible by " + k);
        } else {
            System.out.println("The array cannot be arranged in the required way.");
        }

        scanner.close();
    }

    public boolean canArrange(int[] arr, int k) {
        int map[] = new int[k];
        for(int element:arr){
            int rem = ((element%k)+k)%k;
            map[rem]++;
        }
        if(map[0]%2!=0){
            return false;
        }
        for(int rem=1; rem<=k/2; rem++){
            int comp = k-rem;
            if(map[rem]!=map[comp]){
                return false;
            }
        }
        return true;
    }
}
