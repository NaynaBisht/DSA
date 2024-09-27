package CompetitiveCoding;

public class MaxSumHourglass {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        System.out.println( "Max sum is : " +findMaxSum(matrix));
    }
    static int findMaxSum(int[][] mat){

        int rows = mat.length;
        int cols = mat[0].length;
        int maxSum = Integer.MIN_VALUE;

        if(rows<3 || cols<3){
            System.out.println("Not possible to calculate hourglass sum for the given matrix size.");
            return Integer.MIN_VALUE;
        }

        for (int i = 0; i < rows-2; i++) {
            for (int j = 0; j < cols-2; j++) {
                int sum = mat[i][j] + mat[i][j+1] + mat[i][j+2]
                                    + mat[i+1][j+1]
                        + mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2];

                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
