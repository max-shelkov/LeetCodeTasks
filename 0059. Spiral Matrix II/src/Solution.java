public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int input1 = 5;

        for (int i = 5; i < 11; i++) {
            long start = System.currentTimeMillis();
            int[][] res = solution.generateMatrix(i);
            long finish = System.currentTimeMillis();
            for (int[] row: res) {
                for (int cell: row) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }
            System.out.println("time = " + (finish-start));

        }

    }

    public int[][] generateMatrix(int n) {
        int num = 1;
        int upRow = 0;
        int rightColumn = n-1;
        int bottomRow = n-1;
        int leftColumn = 0;

        int[][] res = new int[n][n];
        while (num <= n*n) {
            num = fillTopRow(num, res, upRow, leftColumn);
            num = fillRightColumn(num, res, upRow, rightColumn);
            num = fillBottomRow(num, res, bottomRow, rightColumn);
            num = fillLeftColumn(num, res, bottomRow, leftColumn);
            upRow++;
            rightColumn--;
            bottomRow--;
            leftColumn++;
        }

        return res;
    }

    private int fillTopRow(int num, int[][] arr, int row, int column){
        for (int i = column; i < arr[row].length; i++) {
            if (arr[row][i] == 0) {
                arr[row][i] = num;
                num++;
            }
        }
        return num;
    }

    private int fillRightColumn(int num, int[][] arr, int row, int column){
        for (int i = row; i < arr.length; i++) {
            if (arr[i][column] == 0) {
                arr[i][column] = num;
                num ++;
            }
        }
        return num;
    }

    private int fillLeftColumn(int num, int[][] arr, int row, int column){
        for (int i = row; i >= 0 ; i--) {
            if (arr[i][column] == 0){
                arr[i][column] = num;
                num++;
            }
        }
        return num;
    }

    private int fillBottomRow(int num, int[][] arr, int row, int column){
        for (int i = column; i >= 0; i--) {
            if (arr[row][i] == 0){
                arr[row][i] = num;
                num++;
            }
        }
        return num;
    }

}
