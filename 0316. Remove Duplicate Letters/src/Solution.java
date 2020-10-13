import java.util.*;

public class Solution {
    // done
    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "cbacadcbc";
        long start = System.currentTimeMillis();
        String res = solution.removeDuplicateLetters(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = |" + res + "|");
        System.out.println("time = " + (finish-start));

    }



    public String removeDuplicateLetters(String s) {
        int maxSize = 'z' - 'a' +1;

        int[] chars = new int[maxSize];
        boolean[] checkedChars = new boolean[maxSize];

        for(char ch : s.toCharArray()){
            chars[ch-'a']++;
        }

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            chars[ch - 'a']--;
            if(!checkedChars[ch - 'a']) {
                while (!stack.isEmpty() && ch < stack.peek() && chars[stack.peek() - 'a'] > 0)
                    checkedChars[stack.pop() - 'a'] = false;
                stack.push(ch);
                checkedChars[ch - 'a'] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())sb.append(stack.pop());
        return sb.reverse().toString();
    }

}
