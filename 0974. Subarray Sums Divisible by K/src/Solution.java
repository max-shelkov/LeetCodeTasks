import java.util.HashMap;


public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {7890,-9844,1951,7162,3408,7799,-509,421,-1580,6347,-9574,-9756,-9525,9713,-1406,4864,5754,-8917,-2730,491,3240,6514,-8238,-5114,4745,-816,4685,-3539,-3414,837,1949,2733,9215,-9886,8097,4345,-8740,-7791,1418,5903,-2668,2619,742,7303,6990,-9223,-5807,-5723,4090,653,2609,-223,3087,-5355,1200,7891,1731,146,-4509,5497,-8403,-743,-8269,-5034,9917,-9996,-8973,1242,-4476,6166,-5231,7337,-8595,-193,8269,4471,4917,3989,5400,2405,8698,-5529,-8640,9745,-3915,-1833,2404,-455,-7292,3317,9849,5298,-9385,2217,-1004,-7176,-5357,-6529,8335,6110,3056,6877,-8073,4181,5757,8619,-855,8939,-1383,8219,-2806,3982,3244,-3694,-2262,-2672,-1975,4959,5185,-60,-4577,8483,2969,-2836,1105,-3588,-1891,1161,3086,5339,6721,7051,3574,3569,8638,3004,-1527,2694,-2279,-8805,-2606,-2863,-6994,-3988,9493,-2806,-7105,-8819,4515,-5580,5197,3360,-6488,6494,1470,-4255,-5901,-2478,2406,4717,-972,-7411,7860,7247,-5521,8311,3495,7487,3716,-305,-9468,7762,72,-928,2146,1145,9381,-7330,5667};
        int k = 1823;
        long start = System.currentTimeMillis();
        int res = solution.subarraysDivByK(nums, k);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));


    }

    public int subarraysDivByK(int[] nums, int k) {
        if (nums == null || nums.length < 1) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;

        for(int num : nums) {
            sum += num;
            int key = ((sum % k) + k) % k;
            map.put(key ,map.getOrDefault(key,0)+1);
        }

        int res=0;
        for(int key : map.keySet()) {
            int val = map.get(key);
            if(val > 1) {
                res += ((val * (val - 1)) / 2);
            }
        }

        return res+(map.get(0) != null ? map.get(0) : 0);
    }



/*
    public int subarraysDivByK(int[] nums, int k) {
        if (nums == null || nums.length < 1) return 0;
        int res = 0;
        int sum;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum % k == 0) res++;
            }
        }
        return res;
    }
*/


}