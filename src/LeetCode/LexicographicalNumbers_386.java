package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers_386 {
    public static void main(String[] args) {
        LexicographicalNumbers_386 lo = new LexicographicalNumbers_386();
        int n = 50; // Example input

        List<Integer> result = lo.lexicalOrder(n);
        System.out.println(result);  // Output the result in lexicographical order
    }
    public void dfs(int curNum, int target, List<Integer> res){
        if (curNum>target){
            return;
        }
        res.add(curNum);
        for(int d  = 0; d<10; d++){
            if(curNum*10+d>target){
                break;
            }
            dfs(curNum*10+d, target, res );
        }
    }
    public List<Integer> lexicalOrder(int n){
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            if(i>n) break;
            dfs(i,n,res);
        }
        return res;
    }
}
