public class Solution {

    // done

    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "abdbc";
        long start = System.currentTimeMillis();
        String res = "";
        for (int i = 0; i < 10000; i++) {
            res = solution.longestPalindrome(input);
        }
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));
    }

    private int maxLen = 1;
    private int mStart = -1;
    private int mFinish = -1;

    public String longestPalindrome(String s) {

        if (s.length() == 0) return "";
        if (s.length() == 1) return s;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++){
            check(arr,i,i);
            check(arr,i,i+1);
        }
        if (mStart < 0 || mFinish < 0) return s.substring(0,1);
        return s.substring(mStart, mFinish+1);
    }

    private void check(char[] arr, int start, int finish){
        if (start<0 || finish>=arr.length) return;
        if (arr[start] == arr[finish]){
            int len = finish-start+1;
            if (len > maxLen){
                maxLen = len;
                mStart = start;
                mFinish = finish;
            }
            check(arr, start-1, finish+1);
        }
    }

}
