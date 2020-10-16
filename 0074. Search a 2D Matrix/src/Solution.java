public class Solution {

//    done

    public static void main(String[] args) {
        int[][] inputMatrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int target = 4;
        Solution solution = new Solution();
        boolean res = solution.searchMatrix(inputMatrix, target);
        System.out.println("res = " + res);


    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix==null
                || matrix.length == 0
                || matrix[0].length == 0
                || matrix[matrix.length-1][matrix[0].length-1] < target
                || matrix[0][0] > target) return false;
        int x = 0;
        int y = 0;
        while (matrix[y][x] <= target && x < matrix[0].length && y<matrix.length){
            System.out.println("y = " + y + ":x = " + x);
            if (matrix[y][x] == target) return true;
            if (target > matrix[y][matrix[0].length-1]) y++;
            else x++;
        }
        return false;
    }

}
