import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) {




        Solution solution = new Solution();
        String input1 = "ab-cd";
        String input2 = "a-bC-dEf-ghIj";
        String input3 = "Test1ng-Leet=code-Q!";
        String input4 = "7_28]";
        long start = System.currentTimeMillis();
        String res = solution.reverseOnlyLetters(input4);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));

    }


    public String reverseOnlyLetters(String s) {
        if (s == null || s.isEmpty()) return "";
        if (s.length()==1) return s;

        ArrayList<Character> toReverse = new ArrayList<>();
        ArrayList<Integer> toStay = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((65 <= ch && ch <= 90) || (97 <= ch && ch <= 122)) {
                toReverse.add(ch);
            } else {
                toStay.add(i);
            }
        }
        Collections.reverse(toReverse);
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (toStay.contains(i)){
                sb.append(s.charAt(i));
            } else {
                sb.append(toReverse.get(index));
                index++;
            }
        }

        return sb.toString();
    }

}
