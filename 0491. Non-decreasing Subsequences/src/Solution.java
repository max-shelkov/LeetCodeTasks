import java.util.ArrayList;
import java.util.List;

public class Solution {



    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {4,6,7,7};

        long start = System.currentTimeMillis();
        List<List<Integer>> res = solution.findSubsequences(nums);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));


    }

    int[] mNums;
    List<List<Integer>> mResult;
    int[] mCurrentList;
    int mCurrentListSize;


    public List<List<Integer>> findSubsequences(int[] nums) {
        mResult = new ArrayList<>();
        if (nums == null || nums.length == 0) return mResult;
        mNums = nums;
        mCurrentList = new int[nums.length+1];
        iteration(0, -1);
        return mResult;
    }

    public void iteration(int i, int l ) {
        if (i >= mNums.length) {
            if (mCurrentListSize >= 2) {
                var result = new ArrayList<Integer>(mCurrentListSize);
                for(int j = 0; j < mCurrentListSize; j++)
                    result.add(mCurrentList[j]);
                mResult.add(result);
            }
            return;
        }
        if (l == -1 || mNums[i] >= mNums[l]) {
            mCurrentList[mCurrentListSize++] = mNums[i];
            iteration(i+1, i);
            mCurrentListSize--;
        }
        if ((l == -1) || (mNums[i] != mNums[l]))
            iteration(i+1, l);
    }
}