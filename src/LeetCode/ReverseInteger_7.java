package LeetCode;

/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0*/
public class ReverseInteger_7 {
    public static void main(String[] args) {
        ReverseInteger_7 obj = new ReverseInteger_7();
        int num = -123;
        System.out.println(obj.reverse(num));

    }
    public int reverse(int x) {
        int revnum = 0;
        int lastdig;

        while (x!=0)
        {
            lastdig = x%10;

            // Check for overflow: If revNum is outside the range where it could lead to overflow
            if(revnum>Integer.MAX_VALUE/10 || revnum>Integer.MAX_VALUE/10 && lastdig > 7)
                return 0;
            if(revnum<Integer.MIN_VALUE/10 || revnum<Integer.MIN_VALUE/10 && lastdig < -8)
                return 0;

            revnum = revnum*10 + lastdig;
            x/=10;
        }
    return revnum;
    }
}
