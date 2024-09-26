package StriverDSA.BasicMaths;

public class ReverseNumber {
    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber();
        int num = 22074;
        System.out.println(obj.reverse(num));

    }
    int reverse(int n) {
        int revNum = 0;
        int lastdig;
        while (n > 0) {
            lastdig = n % 10;
            n /= 10;
            revNum = (revNum*10)+lastdig;
        }
        return revNum;
    }

}
