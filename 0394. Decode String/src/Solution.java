public class Solution {

    public static void main(String[] args) {
        String input = "3[a2[c]]";
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        String res = solution.decodeString(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));

    }

    public String decodeString(String s) {

/*
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', };
        for (char c: ch) {
            System.out.println(c);
        }
*/

        StringBuilder sb = new StringBuilder(s);
        int left = -1;
        int right = -1;
        do {
            left = -1;
            right = -1;
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == '[') {
                    left = i;
                }
                if (sb.charAt(i) == ']' && left >= 0) {
                    right = i;
                }
                if (left > 0 && right > 0) {
                    int numLength = 0;
                    for (int n = left-1; n >= 0; n--){
                        char c = sb.charAt(n);
                        if (sb.charAt(n) >= 48 && sb.charAt(n) <= 57)
                            numLength++;
                        else break;
                    }
                    int repeat = Integer.parseInt(sb.substring(left-numLength,left));
                    String strToRepeat = sb.substring(left + 1, right);
                    sb.replace(left - numLength, right + 1, strToRepeat.repeat(repeat));
                    break;
                }
            }
        }while(left > 0);
        return sb.toString();

    }


}
