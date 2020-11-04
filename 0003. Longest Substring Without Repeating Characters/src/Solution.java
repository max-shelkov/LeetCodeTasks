import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

    //done

    public static void main(String[] args) {
//        String s = "abcabcbb";
//        String  s = "bbbbb";
        String  s = "au";

        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int res = solution.lengthOfLongestSubstring(s);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));
    }

    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        Set<Character> set = new HashSet<>();
        int res = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            int counter = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(set.add(arr[j])){
                    counter++;
                    res = Math.max(res, counter);
                } else {
                    res = Math.max(res, counter);
                    set.clear();
                    break;
                }
            }
        }
        return res;

    }

}
