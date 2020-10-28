import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input = {};
//        int[] input = {0,2,3,4,6,8,9};
        List<String> res = null;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            res = solution.summaryRanges(input);
        }
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        int start = nums[0];
        int finish = nums[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < nums.length; i++) {
            if (finish + 1 != nums[i]) {
                if (start == finish) {
                    res.add(sb.append(finish).toString());
                } else {
                    res.add(sb.append(start).append("->").append(finish).toString());
                }
                start = nums[i];
                sb.delete(0,sb.length());
            }
            finish = nums[i];
        }
        if (start == finish){
            res.add(sb.append(finish).toString());
        }else {
            res.add(sb.append(start).append("->").append(finish).toString());
        }
        return res;
    }

}
