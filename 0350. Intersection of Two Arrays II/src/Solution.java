import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input2_nums1 = {4,9,5};
        int[] input2_nums2 = {9,4,9,8,4};
        int[] input3_nums1 = {1,2};
        int[] input3_nums2 = {1,1};


        long start = System.currentTimeMillis();
        int[] res = solution.intersect(input2_nums1,input2_nums2);
        long finish = System.currentTimeMillis();

        for (int i: res) {
            System.out.print(i + " ");
        }
        System.out.println("\ntime = " + (finish-start));

    }

    public int[] intersect(int[] nums1, int[] nums2) {

        int[] min = nums1.length < nums2.length ? nums1 : nums2;
        int[] max = nums1.length < nums2.length ? nums2 : nums1;
        ArrayList<Integer> resArrayList = new ArrayList<>();

        Arrays.sort(min);
        Arrays.sort(max);

        int indexOfMin = 0;
        int indexOfMax = 0;
        while (indexOfMin < min.length && indexOfMax < max.length){
            if (min[indexOfMin] == max[indexOfMax]) {
                resArrayList.add(min[indexOfMin]);
                indexOfMin++;
                indexOfMax++;
            } else if (min[indexOfMin] < max[indexOfMax]){
                indexOfMin++;
            } else {
                indexOfMax++;
            }
        }
        int[] res = new int[resArrayList.size()];
        for (int i = 0; i < resArrayList.size(); i++) {
            res[i] = resArrayList.get(i);
        }

        return res;
    }



}
