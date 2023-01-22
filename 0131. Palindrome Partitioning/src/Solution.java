import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input = "aab";

        long start = System.currentTimeMillis();
        List<List<String>> res = solution.partition((input));
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));

    }

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        if (s==null || s.isEmpty()) return res;
        List<String> temp = new ArrayList<>();
        iterator(s, temp, res);
        return res;
    }


    private void iterator(String s, List<String> temp, List<List<String>> res) {
        if (s.isEmpty()) {
            List<String> list = new ArrayList<>(temp);
            res.add(list);
            return;
        }

        for (int i = 1; i <= s.length(); ++i) {
            String left = s.substring(0, i);
            if (isPalindrome(left)) {
                String right = s.substring(i);
                temp.add(left);
                iterator(right, temp, res);
                temp.remove(temp.size()-1);
            }
        }
    }


    private boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());

    }

}


