import java.util.Stack;

public class Solution {

    //done

    public static void main(String[] args) {
        int[] input = {3,1,4,2};
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        boolean res = solution.find132pattern(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));
    }

    public boolean find132pattern(int[] nums) {
        int middle = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums [i] < middle) return true;
            while (!stack.isEmpty() && nums [i] > stack.peek ())
                middle = stack.pop ();
            stack.push (nums [i]);
        }
        return false;
    }

}
