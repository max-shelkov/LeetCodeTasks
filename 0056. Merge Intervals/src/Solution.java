import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
//        int[][] input = {{1,3},{2,6},{8,16},{15,18}};
        int[][] input = {{2,6},{1,3},{8,16},{15,18}};
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        int[][] res = solution.merge(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = ");
        if (res!=null)
        for (int[] arr:res) {
            for (int i: arr) {
                System.out.print(" "+i);
            }
            System.out.println();
        }
        System.out.println("time = " + (finish - start));


    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(ints -> ints[0]));
        ArrayList<int[]> res = new ArrayList<>();
        int start = intervals[0][0];
        int finish = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= finish){
                finish = Math.max(finish, intervals[i][1]);
            } else {
                int[] item = {start,finish};
                res.add(item);
                start = intervals[i][0];
                finish = intervals[i][1];
            }
        }
        int[] item = {start,finish};
        res.add(item);
        return res.toArray(new int[res.size()][2]);
    }

}
