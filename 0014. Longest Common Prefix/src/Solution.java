public class Solution {
    //done
    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        String result = solution.longestCommonPrefix(strs);
        long finish = System.currentTimeMillis();
        System.out.println("result = " + result);
        System.out.println("time = " + (finish-start));

    }

    public String longestCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            Character ch = null;
            boolean isCommon = true;
            for (int j = 0; j < strs.length; j++){
                if (ch == null){
                    ch = strs[j].charAt(i);
                } else if (ch != strs[j].charAt(i))
                    isCommon = false;
            }
            if (isCommon) sb.append(ch);
            else break;
        }
        return sb.toString();
    }


}