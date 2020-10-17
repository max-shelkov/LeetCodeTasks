import java.util.*;

public class Solution {

    //done

    public static void main(String[] args) {
        String inputS = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        Solution solution = new Solution();
        List<String> res = null;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            res = solution.findRepeatedDnaSequences(inputS);
        }
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));
    }

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        if (s == null || s.length() < 11) return res;
        int sequenceLength = 10;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length()-sequenceLength+1; i++) {
            String sub = s.substring(i, i+sequenceLength);
            if (!set.add(sub)) {
                if (!res.contains(sub)) res.add(sub);
            }
        }
        return res;
    }
/*
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        if (s == null || s.length() < 11) return res;
        int sequenceLength = 10;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length()-sequenceLength+1; i++) {
            String sub = s.substring(i, i+sequenceLength);
            if (map.containsKey(sub)) {
                map.replace(sub, map.get(sub)+1);
                if (map.get(sub) == 2) res.add(sub);
            } else{
                map.put(sub,1);
            }
        }
        return res;
    }
*/

}
