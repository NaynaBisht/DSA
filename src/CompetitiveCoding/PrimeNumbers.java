package CompetitiveCoding;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 7;
        PrimeNumbers p = new PrimeNumbers();
        System.out.print(p.isPrime(n));
    }
    boolean isPrime(int n){
        if (n==1)
            return false;

        if (n%2==0 || n%3==0)
            return false;

        for (int i = 5; i*i <= n ; i+=6) {
            if(n%i == 0 || n%(i+2) == 0)
                return false;
        }
        return true;
    }
}
