package LeetCode;

import java.util.ArrayList;
import java.util.List;

/*Given a string expression of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators. You may return the answer in any order.
*
* expression consists of digits and the operator '+', '-', and '*'.
All the integer values in the input expression are in the range [0, 99].
*/
public class WaysToAddParenthesis_241 {
    public static void main(String[] args) {
        WaysToAddParenthesis_241 obj = new WaysToAddParenthesis_241();

        // Test input: expression with numbers and operators
        String expression = "2*3-4*5";

        // Get all possible results by computing different ways to group numbers and operators
        List<Integer> result = obj.diffWaysToCompute(expression);

        // Output the result
        System.out.println("Possible results for expression '" + expression + "': " + result);
    }
    public List<Integer> diffWaysToCompute(String expression) {
        int n = expression.length();

//        storing using dp
        List<Integer> [][] dp = new ArrayList[n][n];

        return recur(expression,0,n-1, dp);
    }
    public List<Integer> recur(String exp, int start, int end, List<Integer> [][] dp){
        List<Integer> res = new ArrayList<>();

        if (dp[start][end]!=null)
            return dp[start][end];

        //base cases - single dig no
        if(start == end){
            int num = exp.charAt(start)-'0';
            res.add(num);
            return res;
        }
//      base case double dig
        if (end-start == 1 && Character.isDigit(exp.charAt(start))){
//            int num1 = exp.charAt(start) - '0';
//            int num2 = exp.charAt(end) - '0';
            int num = Integer.parseInt(exp.substring(start, end+1));
            res.add(num);
            return res;
        }
//        split
        for (int i = start; i <= end; i++) {
            if(Character.isDigit(exp.charAt(i))){
                continue;
            }
            char op = exp.charAt(i);
            List<Integer> left = recur(exp, start, i-1, dp);
            List<Integer> right = recur(exp, i+1, end, dp);
            for(int l:left){
                for(int r: right){
                    if(op=='*'){
                        res.add(l*r);
                    } else if (op == '+') {
                        res.add(l+r);
                    }else{
                        res.add(l-r);
                    }
                }
            }
        }
        dp[start][end] = res;
        return res;
    }
}
