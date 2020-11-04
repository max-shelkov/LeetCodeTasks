import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[][] edges = {{1,0},{1,2},{1,3}};
        int n = 4;
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        List<Integer> res = solution.findMinHeightTrees(n, edges);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));


    }

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {

        List<Integer> res = new ArrayList<>();
        if (n<=2) {
            for (int i = 0; i < n; i++) res.add(i);
            return res;
        }

        Set<Integer> nodesSet = new HashSet<>();
        for (int i = 0; i < n; i++) nodesSet.add(i);

        List<Integer>[] list = new ArrayList[n];
        for (int i = 0; i < n; i++) list[i] = new ArrayList<>();
        for (int[] edge : edges) {
            list[edge[0]].add(edge[1]);
            list[edge[1]].add(edge[0]);
        }

        while (nodesSet.size() > 2) {
            Set<Integer> nodes = new HashSet<>();
            Set<Integer> leaves = new HashSet<>();
            for (int i:nodesSet) {
                if (list[i].size() == 1) {
                    leaves.add(i);
                    nodes.add(list[i].get(0));
                }
            }
            for (int node:nodes) {
                list[node].removeAll(leaves);
            }
            nodesSet.removeAll(leaves);
        }
        return new ArrayList<>(nodesSet);



    }

}
