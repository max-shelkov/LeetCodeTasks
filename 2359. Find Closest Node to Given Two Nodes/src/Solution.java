import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
//        Solution solution = new Solution();
//        long start = System.currentTimeMillis();
//        int res = solution.closestMeetingNode();
//        long finish = System.currentTimeMillis();
//        System.out.println("res = " + res);
//        System.out.println("time = " + (finish-start));
    }


    public int closestMeetingNode(int[] edges, int n1, int n2) {
        int res = Integer.MAX_VALUE;
        int n= edges.length;
        int[] a= new int[n];
        int[] b= new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.MAX_VALUE;
            b[i] = Integer.MAX_VALUE;
        }

        iteration(n1, a, edges, n);
        iteration(n2, b, edges, n);

        int nodeNum = -1;

        for(int i = 0; i < n; i++){
            if(a[i] == Integer.MAX_VALUE || b[i] == Integer.MAX_VALUE) continue;
            if(res > Math.max(a[i],b[i])){
                nodeNum = i;
                res = Math.max(a[i],b[i]);
            }
        }
        return nodeNum;
    }
    void iteration(int src, int[] dist, int[] edge, int n){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        dist[src] = 0;
        while(queue.size() > 0){
            var p= queue.remove();
            if(edge[p] != -1 && dist[edge[p]] == Integer.MAX_VALUE){
                queue.add(edge[p]);
                dist[edge[p]]= dist[p]+1;
            }
        }
    }


}