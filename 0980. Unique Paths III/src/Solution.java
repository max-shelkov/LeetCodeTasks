import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
/*
        int[][] input = {   {1,0,0,0},
                            {0,0,0,0},
                            {0,0,2,-1}  };
*/
        int[][] input = {};
        long start = System.currentTimeMillis();
        int res = 0;
        for (int i = 0; i < 100; i++) {
            res = solution.uniquePathsIII(input);
        }

        long finish = System.currentTimeMillis();
        System.out.println("res = " + res);
        System.out.println("time = " + (finish-start));
    }



    private int paths;
    public int uniquePathsIII(int[][] grid) {
        if (grid.length == 0) return 0;
        paths = 0;
        for (int y = 0; y < grid.length; y++)
            for (int x = 0; x < grid[y].length; x++) {
                if (grid[y][x] == 1) {
                    findPaths(x, y, new ArrayList<>(), grid);
                    break;
                }
            }
        return paths;
    }

    private void findPaths(int x, int y, ArrayList<int[]> path, int[][] map) {
        if (x<0 || y<0 || y>= map.length || x >= map[y].length || map[y][x] == -1 || map[y][x] == 3) return;
        int[][] grid = makeCopy(map);
        if (grid[y][x] == 2) {
            path.add(new int[] {x,y});
            if (allCellsStepped(grid))
            paths++;
        }
        if (grid[y][x] == 1 || grid[y][x] == 0){
            grid[y][x] = 3;
            path.add(new int[] {x,y});
            findPaths(x+1,y,new ArrayList<>(path), grid);
            findPaths(x,y+1,new ArrayList<>(path), grid);
            findPaths(x-1,y,new ArrayList<>(path), grid);
            findPaths(x,y-1,new ArrayList<>(path), grid);
        }
    }

    private int[][] makeCopy(int[][] array){
        int[][] copy=new int[array.length][];
        for(int row=0; row<array.length; ++row){
            copy[row]=new int[array[row].length];
            System.arraycopy(array[row], 0, copy[row], 0, copy[row].length);
        }
        return copy;
    }

    private boolean allCellsStepped(int[][] map) {
        for (int[] row : map)
            for (int cell : row) {
                if (cell == 0) return false;
            }
        return true;
    }


}
