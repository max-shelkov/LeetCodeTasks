import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

//        int n = 3;
//        int[][] trust = {{1,3}, {2,3}};
//        int n = 3;
//        int[][] trust = {{1,3},{2,3},{3,1}};
//        int n = 4;
//        int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        int n = 2;
        int[][] trust = {{2,1},{1,2}};

        long start = System.currentTimeMillis();
        int res = solution.findJudge(n, trust);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));
    }

    public int findJudge(int n, int[][] trust) {
        if (trust.length == 0 && n == 1) return 1;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int[] item : trust) {
            if (map.containsKey(item[1])){
                map.get(item[1]).add(item[0]);
            } else {
                ArrayList<Integer> believers = new ArrayList<>();
                believers.add(item[0]);
                map.put(item[1], believers);
            }
        }

        for (int[] item : trust) {
            map.remove(item[0]);
        }

        ArrayList<Integer> judgeCandidates = new ArrayList<>(map.keySet());
        for (Integer judgeCandidate : judgeCandidates) {
            if (map.get(judgeCandidate).size() == n - 1) return judgeCandidate;
        }
        return -1;
    }

}