package LeetCode;

public class ToLowerCase_709 {
    public static void main(String[] args) {
        ToLowerCase_709 obj = new ToLowerCase_709();
        System.out.println(obj.toLowerCase("hey"));
        System.out.println(obj.toLowerCase("WHAT"));
        System.out.println(obj.toLowerCase("Hey There"));
    }
    public String toLowerCase(String s){
        /*Method 1 :
        return s.toLowerCase();*/

//        Method 2:
//        check for uppercase characters in the string - conv str to char array

        char[] c = s.toCharArray();
        /* c.length = arr length
        *  c.length() = string length */
        for (int i = 0; i < c.length; i++) {

            /*using ascii values -
            65-90 for uppercase,
             97-122 for lowercase
             and diff = 32*/

            /*even tho we are comparing char with integer jvm will just upcast char here for arithmetic operation and check for its ascii value*/
            if (c[i]>=65 && c[i]<=90){
                c[i] = (char)(c[i] + 32);
            }
        }
//        convert array to string
        return String.valueOf(c);
    }

//    METHOD 3 : but not memory efficient
    public String toLower(String s){
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i)<='Z'){
                result += (char) (s.charAt(i)+32);
            }
            else {
                result += s.charAt(i);
            }
        }
        return result;
    }
    
    public String lowerCase(String s){
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c>=65 && c<=90){
                c = (char)(c+32);
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
