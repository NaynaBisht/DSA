package Recursion;

public class NumbersExample {
    public static void main(String[] args) {
        print(1);
        System.out.println();
        func(5);
        System.out.println();
        funcRev(5);
        System.out.println();
        funcBoth(5);
    }
//    12345
    static void print(int n){
        if(n==5){
            System.out.print(5);
            return;
        }
        System.out.print(n);

//        this is called tail recursion
//        last function call
        print(n+1);
    }

//    54321
    static void func(int n){
        if(n==0)
            return;
        System.out.print(n);
        func(n-1);
    }
    static void funcRev(int n){
        if(n==0)
            return;
        funcRev(n-1);
        System.out.print(n);
    }
    static void funcBoth(int n){
        if(n==0)
            return;
        System.out.print(n);
        funcBoth(n-1);
        System.out.print(n);
    }
}