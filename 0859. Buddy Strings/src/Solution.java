import java.util.HashSet;
import java.util.Set;

public class Solution {

    // done as a copy from discuss

    public static void main(String[] args) {
        String inputA = "abad";
        String inputB = "abac";
        Solution solution = new Solution();
        boolean res = solution.buddyStrings(inputA, inputB);
        System.out.println("res = " + res);
    }

    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        Set<Character> set = new HashSet<>();
        Character c1 = null;
        Character c2 = null;
        int counter = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                if (counter > 2) return false;
                if (c1 == null) {
                    counter++;
                    c1 = B.charAt(i);
                    c2 = A.charAt(i);
                    continue;
                }
                if (c1 != A.charAt(i) || c2 != B.charAt(i)) return false;
                counter++;
            }
            set.add(A.charAt(i));
        }
        return counter == 2 || (counter == 0 && set.size() < A.length());
    }
}
