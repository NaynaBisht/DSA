package Search;

public class EvenNumOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,45,9064,131,34545,};
        System.out.println(findNumbers(nums));

        System.out.println(digits(7894567));

        System.out.println(digits2(7894567));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums) {
            if(even(num))
                count++;
        }
        return count;
    }

//    func to check if a number contains even numb of digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
//        if(numberOfDigits%2==0)
//            return true;
//        else
//            return false;

        return numberOfDigits%2==0;
    }
//    to count the digits
    static int digits(int num){

//        for negative numbers
        if(num<0){
            num = num*-1;
        }

//        for zero since 0 = 1 digit
        if (num==0)
            return 1;

        int count=0;
        while (num>0){
            count++;
            num/=10;
        }
        return count;
    }
//    shortcut to find number of digits
    static int digits2(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
    }
}
