import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> res = new ArrayList<>();
        int[] input = {0,-1,2,-1};
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++)
            res = solution.majorityElement(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));



    }
    public List<Integer> majorityElement(int[] nums) {
        int maxSize = nums.length/3;
        int counter1 = 0;
        int counter2 = 0;
        Integer num1 = null;
        Integer num2 = null;
        for (int item : nums){
            if ( num1 != null && num1 == item){
                counter1++;
            } else if ( num2 != null && num2 == item){
                counter2++;
            } else if (counter1 == 0){
                num1 = item;
                counter1++;
            } else if (counter2 == 0){
                num2 = item;
                counter2++;
            } else {
                counter1--;
                counter2--;
            }
        }

        Set<Integer> set = new HashSet<>();
        counter1 = 0;
        counter2 = 0;
        for (int item: nums){
            if (num1 != null && num1 == item) {
                counter1++;
                if (counter1 > maxSize) set.add(num1);
            }
            if (num2 != null && num2 == item) {
                counter2++;
                if (counter2 > maxSize) set.add(num2);
            }
        }
        return new ArrayList<>(set);
    }

}
