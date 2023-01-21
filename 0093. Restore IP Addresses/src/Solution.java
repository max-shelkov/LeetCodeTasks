import java.util.ArrayList;
import java.util.List;

//done
class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
//        String input1 = "2552";
        String input1 = "25525511135";
//        String input1 = "0000";
        long start = System.currentTimeMillis();
        List<String> res = solution.restoreIpAddresses((input1));
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));

    }



    public List<String> restoreIpAddresses(String s) {
        ArrayList<String> res = new ArrayList<>();
        if (s == null || s.length() < 4 || s.length() > 12) return res;

        String[] subs = new String[4];
        StringBuilder sb = new StringBuilder();
        for (int dot1 = 1; dot1 < s.length() - 2; dot1++){
            for (int dot2 = dot1+1; dot2 < s.length() - 1; dot2++) {
                for (int dot3 = dot2+1; dot3 < s.length(); dot3++) {
                    subs[0] = s.substring(0, dot1);
                    subs[1] = s.substring(dot1, dot2);
                    subs[2] = s.substring(dot2, dot3);
                    subs[3] = s.substring(dot3);
                    if (checkIP(subs)){
                        res.add(sb.append(subs[0]).append(".").append(subs[1]).append(".").append(subs[2]).append(".").append(subs[3]).toString());
                        sb.delete(0,sb.length());
                    }

                }

            }
        }
        return res;
    }

    private  boolean checkIP(String[] subs) {
        for (String str : subs) {
            if (str.length() > 1 && str.charAt(0) == '0') return false;
            if (Integer.parseInt(str) > 255) return false;
        }
        return true;
    }
}