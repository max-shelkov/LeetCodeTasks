import java.util.HashMap;
import java.util.Stack;
//done
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        boolean res =  solution.isValid("){");
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));
    }

    public boolean isValid(String s) {
        if (s == null || s.length()%2 != 0) return false;
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '('){
                stack.push(ch);
            } else if (stack.isEmpty() || ch != map.get(stack.pop()))
                return false;
        }
        return stack.isEmpty();
    }

}