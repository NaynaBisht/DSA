package LeetCode;

public class LenOfLongestPrefix_3043 {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        LenOfLongestPrefix_3043 solution = new LenOfLongestPrefix_3043();

        // Sample input arrays
        int[] arr1 = {12345, 12356, 12378};
        int[] arr2 = {12340, 12358, 12379};

        // Find the longest common prefix between the two arrays
        int result = solution.longestCommonPrefix(arr1, arr2);

        // Print the result
        System.out.println("Longest Common Prefix Length: " + result);
    }
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Trie trie = new Trie();
        int maxLen = Integer.MIN_VALUE;
        for(int arr:arr1){
            trie.addWord(Integer.toString(arr));
        }
        for(int arr:arr2){
            int len = trie.findPrefix(Integer.toString(arr));
            maxLen = Math.max(maxLen,len);
        }
        return maxLen;
    }
}
class Node {
    Node child[];
    Node(){
        child = new Node[10];
    }
}

class Trie{
    Node root;
    Trie(){
        root = new Node();
    }
    public void addWord(String word){
        Node temp = root;
        for(char ch:word.toCharArray()){
            int index = ch-'0';
            if(temp.child[index] == null){
                temp.child[index] = new Node();
            }
            temp = temp.child[index];
        }
    }
    public int findPrefix(String word){
        Node temp = root;
        int len = 0;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            int index = ch - '0';
            if(temp.child[index] == null){
                break;
            }
            temp = temp.child[index];
            len++;
        }
        return len;
    }
}