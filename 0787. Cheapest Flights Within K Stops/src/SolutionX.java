import java.util.*;

public class SolutionX {



    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        List<int[]>[] graph = new List[n];
        for (int i = 0; i < graph.length; i++) graph[i] = new ArrayList<>();
        for (int[] flight: flights) graph[flight[0]].add(flight);
        int res = Integer.MAX_VALUE;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{src, 0});
        while (k >= 0 && !queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                int[] node = queue.poll();
                for (int[] flight : graph[node[0]]){
                    int cost = node[1] + flight[2];
                    if (cost >= dist[flight[1]]) continue;
                    if (flight[1] == dst) res = cost;
                    dist[flight[1]] = cost;
                    queue.add(new int[]{flight[1], cost});
                }
            }
            k--;
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

}
