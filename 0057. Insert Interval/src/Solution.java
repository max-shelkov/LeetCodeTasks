import java.util.ArrayList;
import java.util.Comparator;

//done
class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] input = {{3, 5}, {12, 15}};
        int[] newInterval = {6, 6};
        long start = System.currentTimeMillis();
        int[][] res = solution.insert(input, newInterval);
        long finish = System.currentTimeMillis();
        System.out.println("res = ");
        if (res != null)
            for (int[] arr : res) {
                for (int i : arr) {
                    System.out.print(" " + i);
                }
                System.out.println();
            }
        System.out.println("time = " + (finish - start));

    }


    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) return new int[][]{newInterval};


        ArrayList<int[]> res = new ArrayList<>();

        int startNum = newInterval[0];
        int finishNum = newInterval[1];

        int numOfFirstIntervalToMerge = -1;
        int numOfLastIntervalToMerge = -1;


        for (int i = 0; i < intervals.length; i++) {
//            System.out.println("i = " + i);
            if (startNum >= intervals[i][0] && startNum <= intervals[i][1]) {
                numOfFirstIntervalToMerge = i;
            }
            if (finishNum >= intervals[i][0] && finishNum <= intervals[i][1]) {
                numOfLastIntervalToMerge = i;
            }


            if (numOfFirstIntervalToMerge > 0 && numOfLastIntervalToMerge > 0) break;
        }

        int mergedBeginNum = numOfFirstIntervalToMerge >= 0 ? Math.min(newInterval[0], intervals[numOfFirstIntervalToMerge][0]) : newInterval[0];
        int mergedEndNum = numOfLastIntervalToMerge >= 0 ? Math.max(newInterval[1], intervals[numOfLastIntervalToMerge][1]) : newInterval[1];

        int[] merged = {mergedBeginNum, mergedEndNum};


        for (int[] item : intervals) {
            if (item[0] >= merged[0] && item[0] <= merged[1]) continue;
            res.add(item);
        }

        res.add(merged);
        res.sort(Comparator.comparingInt(o -> o[0]));

        int[][] result = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }


        return result;
    }


}