package CompetitiveCoding;

public class SwapNibbles {
    public static void main(String[] args) {
        int num = 172;
        int swapNum;

        swapNum = ( (num & 0x0F)<<4 | (num & 0XF0)>>4 );

        System.out.println(swapNum);
    }
}
