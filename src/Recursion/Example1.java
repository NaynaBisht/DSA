package Recursion;

public class Example1 {
    public static void main(String[] args) {

        message();
        message();
        message();

//        or call msg 1 which in turn calls msg2
        message1();
    }
    static void message(){
        System.out.println("hello world");
    }
    static void message1(){
        System.out.println("hello world");
        message2();
    }
    static void message2(){
        System.out.println("hello world");
    }
}
