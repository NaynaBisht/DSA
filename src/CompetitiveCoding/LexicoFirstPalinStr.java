package CompetitiveCoding;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LexicoFirstPalinStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(moveHyphens(str));

        char ch[] = str.toCharArray();

        TreeMap<Character,Integer> hm = new TreeMap<>();

        for (char ele:
             ch) {
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        }
        System.out.println(makePalindrome(hm));
    }

    static String makePalindrome(TreeMap<Character, Integer> hm){
        int count = 0;
        String prefix ="", oddStr="";
        for(Map.Entry<Character,Integer> e: hm.entrySet()){
            int itr = e.getValue()/2;
            for (int i = 0; i < itr; i++) {
                prefix = prefix+e.getKey();
            }
            if (e.getValue()%2==1){
                oddStr+=e.getKey();
                count++;
            }
            if (count>1)
                return "Cant make a palindrome";
        }
        String suffix = new StringBuilder(prefix).reverse().toString();
        return prefix+oddStr+suffix;
    }
    static String moveHyphens(String str){
        String ans1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='-')
                ans1 = '-'+ans1;
            else ans1+=str.charAt(i);
        }
        return ans1;
    }
}
