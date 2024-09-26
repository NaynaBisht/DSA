package CompetitiveCoding;
import java.util.Scanner;
public class MaxEquilibSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n");
        int n = scanner.nextInt();
        System.out.println("enter array elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = findMaxSum(arr, n);

        if (result != Integer.MIN_VALUE)
            System.out.println(result);
        else
            System.out.println("No equilibrium found");
    }
    static int findMaxSum(int arr[], int n){
        int sum=0;
//        total sum of array
        for(int num:arr){
            sum+=num;
        }
        int prefixsum = 0;
        int maxEquilibriumSum  = Integer.MIN_VALUE;

//        traverse arr
        for (int i = 0; i < n; i++) {
            prefixsum += arr[i];

            int rightsum = sum - prefixsum;

            if(prefixsum == rightsum)
                maxEquilibriumSum  = Math.max(maxEquilibriumSum , prefixsum);
        }
        return maxEquilibriumSum ;
    }
}
