import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int res = solution.uniqueMorseRepresentations(words);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));
    }

    public int uniqueMorseRepresentations(String[] words) {
        String[] alphabet =
                {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> res = new HashSet<>();
        for(String word : words)
        {
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<word.length(); j++) sb.append(alphabet[word.charAt(j) - 'a']);
            res.add(sb.toString());
        }
        return res.size();
    }

}
