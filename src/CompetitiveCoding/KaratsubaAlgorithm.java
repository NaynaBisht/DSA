package CompetitiveCoding;

public class KaratsubaAlgorithm {
    public static void main(String[] args) {
        int x = 2340;
        int y = 345;
        System.out.println(karatsuba(x,y));
    }
    public static int karatsuba(int x, int y){
        if (x<10 || y<10)
            return x*y;

        int m = Math.max(getNumdigits(x), getNumdigits(y));

        int halfM = m/2;

        int powerOf10 = (int) Math.pow(10,halfM);
        int a = x/powerOf10;
        int b = x%powerOf10;
        int c = y/powerOf10;
        int d = y%powerOf10;

        int s1 = karatsuba(a,c);

        int s2 = karatsuba(b,d);

        int s3 = karatsuba(a+b, c+d);

        int s4 = s3-s2-s1;

        int result = s1* (int) Math.pow(10, 2*halfM) + s4*powerOf10 + s2;

        return result;
    }
    public static int getNumdigits(int x){
        if(x==0) return 1;

        int count = 0;
        while(x>0){
            count++;
            x/=10;
        }
        return count;
    }
}
