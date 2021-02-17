public class Solution {

    //done
    public static void main(String[] args) {
        int input = -123;
        Solution solution = new Solution();
        int res = solution.reverse(input);
        System.out.println(res);
    }

    public int reverse(int x) {
        boolean negative = x < 0;
        if (negative) x = x * -1;
        String strRX = new StringBuilder(Integer.toString(x)).reverse().toString();
        try {
            return (negative) ? Integer.parseInt("-"+strRX) : Integer.parseInt(strRX);
        } catch (Exception e){
            return 0;
        }
    }

}
