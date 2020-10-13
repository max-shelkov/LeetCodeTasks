import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] input = {{10,16},{2,8},{1,6},{7,12}};
        long start = System.currentTimeMillis();
        int res = solution.findMinArrowShots(input);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));

    }

    public int findMinArrowShots(int[][] points) {
        if(points.length == 0) return 0;
        Arrays.sort(points, Comparator.comparingInt(ints -> ints[0]));
        int res = 1;
        int[] lastPoint = points[0];
        for(int i = 1; i < points.length; i++) {
            if(points[i][0] > lastPoint[1]) {
                res++;
                lastPoint[1] = points[i][1];
            } else {
                lastPoint = (lastPoint[1] < points[i][1]) ? lastPoint : points[i];
            }
        }
        return res;


/*
        if (points==null || points.length==0) return 0;
        int res = 1;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return Integer.compare(ints[0], t1[0]);
            }
        });
        int[] lastCheckedBaloon = points[0];
        for (int i=1; i<points.length; i++){
            if (points[i][0] < lastCheckedBaloon[1]){
                lastCheckedBaloon = points[i];
                res++;
            } else {
                lastCheckedBaloon = (lastCheckedBaloon[1] > points[i][1]) ? lastCheckedBaloon : points[i];
            }
        }
        return res;
*/
    }

}
