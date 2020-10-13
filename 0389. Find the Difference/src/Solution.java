import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        char res='_';
        String inputS = "abcd";
        String inputT = "abcde";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++)
            res = solution.findTheDifference(inputS, inputT);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + String.valueOf(res));
        System.out.println("time = " + (finish-start));

    }

    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch: s.toCharArray()) {
            int count = map.getOrDefault(ch, 0);
            map.put(ch, ++count);
        }
        for (char ch : t.toCharArray()) {
            int count = map.getOrDefault(ch,0);
            if (count==0) {
                return ch;
            } else if (count == 1){
                map.remove(ch);
            } else {
                map.replace(ch, --count);
            }
        }
        return (char) map.keySet().toArray()[0];
    }


}
