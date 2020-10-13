import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        List<Integer> res = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++)
        res = solution.sequentialDigits(10,12);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));

    }

    public List<Integer> sequentialDigits(int low, int high) {

        int minSize = Integer.toString(low).length();
        int maxSize = Integer.toString(high).length();
        String mask = "123456789";
        ArrayList<String> all = new ArrayList<>();
        for (int i = minSize; i <= maxSize; i++)
            for (int n = 0; n <= 9 - i; n++) {
                String sub = mask.substring(n, n + i);
                all.add(sub);
            }
        List<Integer> res = new ArrayList<>();
        for (String s : all) {
            int num = Integer.parseInt(s);
            if (num >= low && num <= high)
                res.add(num);
        }
        return res;

    }

}
