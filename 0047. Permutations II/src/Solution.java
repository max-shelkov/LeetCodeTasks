import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] input  = {1,1,2};
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        List<List<Integer>> res = solution.permuteUnique(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));

    }


    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            Set<String> set = new HashSet<>();
            while (res.get(0).size() == i) {
                List<Integer> list = res.remove(0);
                for (int j = 0; j <= list.size(); j++) {
                    List<Integer> newList = new ArrayList<>(list.subList(0,j));
                    newList.add(nums[i]);
                    newList.addAll(list.subList(j,list.size()));
                    if (set.add(newList.toString())) res.add(newList);
                }
            }
        }
        return res;
    }

}
