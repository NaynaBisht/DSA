package CompetitiveCoding;

public class EuclideanAlgo {
    public static void main(String[] args) {
        int n1 = 120;
        int n2 = 98;
        System.out.println(gcd(n1,n2));
        System.out.println(findGcd(n1,n2));
    }
//    recursive code
    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
//    iterative method
public static int findGcd(int a, int b) {
    while(a !=0 && b != 0) {
        if(a > b) {
            a = a % b;
        }
        else {
            b = b % a;
        }
    }
        if(a == 0) {
            return b;
        }
        return a;
    }
}
