public class Solution {
    public static void main(String[] args) {
        String s = "aaabbzzzz";
        int k = 3;
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int res = solution.longestSubstring(s,k);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));
    }

    public int longestSubstring(String s, int k) {
        return longestSubstring(s, k, 0, s.length() - 1);
    }

    private int longestSubstring(String s, int k, int leftPointer, int rightPointer) {
        if (leftPointer > rightPointer) return 0;
        int[] ch = new int[26];
        for (int i = leftPointer; i <= rightPointer; i++) ch[s.charAt(i) - 'a']++;

        boolean fullString = true;
        int res = 0;
        int prevStart = leftPointer;
        for (int i = leftPointer; i <= rightPointer; i++) {
            if (ch[s.charAt(i) - 'a'] < k && ch[s.charAt(i) - 'a'] > 0) {
                fullString = false;
                res = Math.max(res, longestSubstring(s, k, prevStart, i - 1));
                prevStart = i + 1;
            }
        }

        if (fullString) return rightPointer - leftPointer + 1;

        return Math.max(res, longestSubstring(s, k, prevStart, rightPointer));
    }
}
