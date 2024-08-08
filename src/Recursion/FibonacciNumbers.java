package Recursion;

public class FibonacciNumbers {
    public static void main(String[] args) {
//        print the 7th fibonacci number
        System.out.println(fibo(7));
    }
    static int fibo(int n){

        //base condition
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);

    }
}
