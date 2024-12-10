package CompetitiveCoding;

public class JosephusProblem {
    public static void main(String[] args) {
        int n = 14;
        int k = 3;
        System.out.println("The safe position is "+ josephus(n,k));
    }
    static int josephus (int n, int k){
        if(n==1)
            return 1;

        return (josephus(n-1,k) + k-1) % n+1;
    }
}
