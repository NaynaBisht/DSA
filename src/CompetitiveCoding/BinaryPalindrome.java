package CompetitiveCoding;

public class BinaryPalindrome {
    public static void main(String[] args) {
        int num = 15;
        System.out.println(toBinary(num));
        System.out.println(isBinaryPalindrome(num));
    }
    static String toBinary(int num){
        if(num==0){
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while(num>0){
            binary.append(num%2);
            num/=2;
        }
        return binary.reverse().toString();
    }
    static boolean isBinaryPalindrome(int num){
        int revBinary = 0;
        int copyNum = num;
        while(copyNum!=0){
            revBinary = (revBinary<<1) | (copyNum&1);
            copyNum >>= 1;
        }
        return revBinary == num;
    }
}
