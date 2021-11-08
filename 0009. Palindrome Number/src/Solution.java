public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        boolean res;
        double start = System.currentTimeMillis();
        res = solution.isPalindrome(-3223);
        double finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));

    }

    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder().append(x);
        return sb.toString().equals(sb.reverse().toString());
    }
}
