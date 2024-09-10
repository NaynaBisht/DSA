package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

/*You are given two integers m and n, which represent the dimensions of a matrix.

You are also given the head of a linked list of integers.

Generate an m x n matrix that contains the integers in the linked list presented in spiral order (clockwise), starting from the top-left of the matrix. If there are remaining empty spaces, fill them with -1.*/
public class SpiralMatrix_2326 {
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);

        int m = 3; // number of rows
        int n = 3; // number of columns

        SpiralMatrix_2326 solution = new SpiralMatrix_2326();
        int[][] matrix = solution.spiralMatrix(m, n, head);

        // Print the resulting matrix
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    public int[][] spiralMatrix(int m, int n, ListNode head){
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(matrix[i],-1);
        }
        int topRow = 0, bottomRow = m-1, leftCol = 0, rightCol = n-1;
        while(head!=null){
            for (int col = leftCol; col <=rightCol ; col++) {
                if(head == null) break;
                matrix[topRow][col] = head.val;
                head = head.next;
            }
            topRow++;

            for (int row = topRow; row<=bottomRow; row++){
                if (head==null) break;
                matrix[row][rightCol] = head.val;
                head = head.next;
            }
            rightCol--;

            for (int col = rightCol; col >= leftCol ; col--) {
                if (head==null) break;
                matrix[bottomRow][col] = head.val;
                head = head.next;
            }
            bottomRow --;

            for (int row = bottomRow; row >= topRow ; row--) {
                if (head==null) break;
                matrix[row][leftCol] = head.val;
                head = head.next;
            }
            leftCol++;
        }
        return matrix;
    }
}
