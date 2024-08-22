package CompetitiveCoding;
// print all primes smaller than or equal to n
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 30;
        System.out.println("Following are the prime numbers");
        SieveOfEratosthenes s = new SieveOfEratosthenes();
        s.sieve(n);
    }
    void sieve(int n){
        int prime[] = new int[n+1];

        for (int i = 0; i <= n; i++) {
            prime[i] = 1;
        }
        for (int i=2; i*i <= n; i++){
            if (prime[i]==1){
                for (int j = i*i; j <= n; j+=i) {
                    prime[j] = 0;
                }
            }
        }
        for (int i = 2; i <= n ; i++) {
            if (prime[i] == 1)
                System.out.print(i+" ");
        }
    }
}
