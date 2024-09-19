package StriverDSA.BasicMaths;

import static java.lang.Math.log10;

public class CountDigits {
    public static void main(String[] args) {
        CountDigits obj = new CountDigits();
        int num = 22074;
        System.out.println(obj.count(num));
        System.out.println(obj.countdigits(num));
        System.out.println(obj.evenlyDivides(num));

    }
//    optimized sol
    int countdigits(int n){
        int cnt = (int)(log10(n)+1);
        return cnt;
    }
    int count(int n){
        int c = 0;
        int lastdig;
        while(n>0){
            lastdig = n%10;
            n/=10;
            c++;
        }
        return c;
    }
//    Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.
    int evenlyDivides(int N){
        // code here
        int count = 0;
        int dig;
        int copy = N;
        while(N>0){
            dig = N%10;
            if(dig!=0){
                if(copy%dig == 0)
                    count++;
            }
            N/=10;
        }
        return count;
    }
}
