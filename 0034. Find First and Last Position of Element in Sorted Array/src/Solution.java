import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
//        int[] input = {5,7,8,8,9,10};
//        int[] input = {1,2,2,2,2,5,5,5,7,7,8,8,10,10,14,15,15,16,20,21,21,21,21,21,21,22};
        int[] input = {};
        Solution solution = new Solution();
        int[] res;
        long start = System.currentTimeMillis();
        res = solution.searchRange(input, 14);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + Arrays.toString(res));
        long time = finish - start;
        System.out.println("time = " + time);
    }

    int minPointer;
    int maxPointer;
    int[] nums;
    int target;
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[] {-1,-1};
        this.nums = nums;
        this.target = target;
        checkRange(0, nums.length-1);
        return new int[] {minPointer,maxPointer};
    }
    private void checkRange(int start, int finish) {
        if (finish - start <= 1 && nums[start] != target && nums[finish]!=target) {
            minPointer = -1;
            maxPointer = -1;
            return;
        }
        int pos = (start + (finish-start)/2);
        if (nums[pos] == target) {
            findEdges(pos);
        } else if ( nums[pos] < target ) {
            checkRange(pos+1, finish);
        } else {
            checkRange(start, pos-1);
        }
    }
    private void findEdges(int pos) {
        int startPos = pos;
        System.out.println("pos = " + pos);
        maxPointer = pos;
        minPointer = pos;
        while (pos < nums.length && nums[pos] == target){
            maxPointer = pos;
            pos++;
        }
        pos = startPos;
        while (pos >= 0 && nums[pos] == target){
            minPointer = pos;
            pos--;
        }
    }


}
