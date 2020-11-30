public class Solution {
    public static void main(String[] args) {
        int[] input = {4,2,3,0,3,1,2};
        int startK = 0;
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        boolean res = solution.canReach(input, startK);
        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish - start));

    }

    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        return jump(arr, visited, start);
    }

    boolean jump(int[] arr, boolean[] visited, int pointer){
        boolean res = false;
        if(visited[pointer]) return false;
        if(arr[pointer] == 0) return true;
        visited[pointer] = true;
        int left = pointer - arr[pointer];
        int right = pointer + arr[pointer];
        if(left >= 0) res = jump(arr, visited, left);
        if(right < arr.length) res |= jump(arr, visited, right);
        return res;
    }

}
