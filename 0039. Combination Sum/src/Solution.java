import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> res = null;
//        int[] input = {2,3,6,7};
//        int k = 8;
        int[] input = {};
        int k = 2;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1; i++)
            res = solution.combinationSum(input, k);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));
    }

    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length==0) return res;
        check(candidates, target, new ArrayList<>(), 0);
        return res;
    }

    private void check(int[] cands, int k, ArrayList<Integer> nums, int ii){
        if (k<0) return;
        if (k==0) {
            res.add(nums);
            return;
        }
        for (int i=ii; i<cands.length; i++){
            ArrayList<Integer> newNums = new ArrayList<>(nums);
            Collections.copy(newNums, nums);
            newNums.add(cands[i]);
            check(cands, k-cands[i], newNums, i);

        }
    }

}