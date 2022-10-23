public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = 0;
//        -91283472332
        double start = System.currentTimeMillis();
        res = solution.myAtoi("");
        double finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println(Integer.MIN_VALUE + " : " + Integer.MAX_VALUE);
        System.out.println("time = " + (finish-start));
    }

    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;
        int index = 0;
        boolean negative = false;
        s = s.trim();
        if (s.isEmpty()) return 0;
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        if (arr[0] == '-') {
            index++;
            negative = true;
        } else if (arr[0] == '+') {
            index++;
        }

        while (index < arr.length && sb.length() < 12){
            if (arr[index] >= 48 && arr[index] <= 57 ){
                sb.append(arr[index]);
            } else break;
            index++;
        }

        if (negative && sb.length() > 0){
            sb.reverse();
            sb.append('-');
            sb.reverse();
        }

        try {
            return  (sb.length()>0) ? Integer.parseInt(sb.toString()) : 0;
        } catch (Exception e){
            return  (arr[0] == '-') ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }



    }

}
