import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// time limit exceeded

public class Solution {
    public static void main(String[] args) {
        SolutionX solution = new SolutionX();
        boolean res = false;
//        String inputS = "leetcode";
//        List<String> wordDict = new ArrayList<>(Arrays.asList("leet", "code"));
//        String inputS = "applepenapple";
//        List<String> wordDict = new ArrayList<>(Arrays.asList("apple", "pen"));
//        String inputS = "catsandog";
//        List<String> wordDict = new ArrayList<>(Arrays.asList("cat", "dog", "an", "cats"));
        String inputS = "acaaaaabbbdbcccdcdaadcdccacbcccabbbbcdaaaaaadb";
        List<String> wordDict = new ArrayList<>(Arrays.asList("abbcbda","cbdaaa","b","dadaaad","dccbbbc","dccadd","ccbdbc","bbca","bacbcdd","a","bacb","cbc","adc","c","cbdbcad","cdbab","db","abbcdbd","bcb","bbdab","aa","bcadb","bacbcb","ca","dbdabdb","ccd","acbb","bdc","acbccd","d","cccdcda","dcbd","cbccacd","ac","cca","aaddc","dccac","ccdc","bbbbcda","ba","adbcadb","dca","abd","bdbb","ddadbad","badb","ab","aaaaa","acba","abbb"));
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1; i++)
            res = solution.wordBreak(inputS, wordDict);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));


    }

    private boolean res = false;
    public boolean wordBreak(String s, List<String> wordDict) {
        if (wordDict.size()==0) return false;
        wordDict.removeIf(str -> !s.contains(str));
        StringBuilder sb = new StringBuilder(s);
        checkString(sb,wordDict);
        return res;
    }
    private void checkString(StringBuilder sb, List<String> words){
        if (sb.toString().isEmpty()) {
            res = true;
            return;
        }
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (sb.length() >= word.length()) {
                String sub = sb.substring(0, word.length());
                if (sub.equals(word)) {
                    StringBuilder newSb = new StringBuilder(sb.delete(0,word.length()));
                    checkString(newSb, words);
                }
            }
        }
    }

}
