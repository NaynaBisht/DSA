package LeetCode;

public class SumPrefixScoresStr_2416 {
    public int[] sumPrefixScores(String[] words) {
        PrefixTrie trie = new PrefixTrie();
        int count[] = new int[words.length];

        for (String word : words) {
            trie.addWord(word);
        }

        int index = 0;
        for (String word : words) {
            count[index] = trie.findPrefixCount(word);
            index++;
        }
        return count;
    }

    public static void main(String[] args) {
        SumPrefixScoresStr_2416 solution = new SumPrefixScoresStr_2416();
        String[] words = {"abc", "ab", "bc", "b"};
        int[] result = solution.sumPrefixScores(words);

        // Print the result
        for (int score : result) {
            System.out.print(score + " ");
        }
    }
}

class TrieNode {
    TrieNode[] child;
    int count;

    TrieNode() {
        child = new TrieNode[26];
        count = 0;
    }
}

class PrefixTrie {
    TrieNode root;

    PrefixTrie() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode temp = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (temp.child[index] == null) {
                temp.child[index] = new TrieNode();
            }
            temp.child[index].count++;
            temp = temp.child[index];
        }
    }

    public int findPrefixCount(String word) {
        TrieNode temp = root;
        int count = 0;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (temp.child[index] != null) {
                count += temp.child[index].count;
            }
            temp = temp.child[index];
        }
        return count;
    }
}
