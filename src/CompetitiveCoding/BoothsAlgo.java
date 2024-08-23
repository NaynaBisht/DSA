package CompetitiveCoding;

public class BoothsAlgo {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        int product = 0;
        int n = Integer.toBinaryString(a).length();

        for (int i = 0; i<n; i++){
            int currentBit = (a&1);
            if (currentBit == 1)
                product+=b;
            b<<=1;
            a>>=1;
        }
        System.out.println("Result : "+product);
    }
}
