package Search;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("max sum = "+maxWealth(arr));
    }
    static int maxWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
//            take new sum for every row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            System.out.println("Sum of row 1 = "+sum);
            if (sum>max)
                max = sum;
        }
        return max;
    }
}
