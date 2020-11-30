import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[][] buildings = {{2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}};

        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        List<List<Integer>> res = solution.getSkyline(buildings);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));



    }

    public List<List<Integer>> getSkyline(int[][] buildings) {
        if (buildings == null || buildings.length == 0) return new ArrayList<>();
        List<Point> points = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        PriorityQueue<Integer> max = new PriorityQueue<>((a, b)-> b-a);
        for(int[] b : buildings){
            points.add(new Point(b[0], b[2], true));
            points.add(new Point(b[1], b[2], false));
        }
        Collections.sort(points);


        for(Point p : points){
            if(p.left){
                int maxHeight = max.isEmpty() ? 0 : max.peek();
                if(p.height>maxHeight) res.add(Arrays.asList(p.x,p.height));
                max.offer(p.height);
            }else{
                max.remove(p.height);
                int maxHeight = max.isEmpty()? 0:max.peek();
                if(maxHeight<p.height) res.add(Arrays.asList(p.x,maxHeight));
            }
        }
        return res;
    }

    static class Point implements Comparable<Point>{
        int x;
        int height;
        boolean left;
        public Point(int x, int height, boolean left){
            this.x = x;
            this.height = height;
            this.left = left;
        }
        @Override
        public int compareTo(Point p){
            if(this.x!=p.x){
                return this.x-p.x;
            }else{
                if(this.left && p.left){
                    return p.height-this.height;
                }else if(!this.left ){
                    return this.height-p.height;
                }else{
                    return -1;
                }
            }
        }
    }

}
